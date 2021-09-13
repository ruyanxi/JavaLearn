import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author:朢曐(雷杨一凡)
 * @Title: Main
 * @ProjectName:java-se-learning
 * @Description：
 * @date： 2021/8/24 11:58
 */
public class Main {
    public static void main(String[] args) {
        //设置循环条件 back != 0
        int back = 0;
        //创建集合对象储存学生信息
        ArrayList<Student> array = new ArrayList<>();
        while (back == 0) {
            int choice = mainView();
            switch (choice) {
                case 1:

                    addStudent(array);
                    break;
                case 2:
                    deleteStudent(array);
                    break;
                case 3:
                    editStudent(array);
                    break;
                case 4:
                    showStudent(array);
                    break;
                case 5:
                    System.out.println("谢谢使用");
                    back++;
                    break;
                default:
                    System.out.println("输入错误！请输入一个1-5的整数！");
            }
        }

    }

    /**主界面并返回选择的序号*/
    public static int mainView() {
        System.out.println("--------欢迎来到学生管理系统--------");
        System.out.println("\t1 添加学生" +
                "\n\t2 删除学生" +
                "\n\t3 修改学生" +
                "\n\t4 查看所有学生" +
                "\n\t5 退出" +
                "\n请输入你的选择：");
        int choice;
        choice = new Scanner(System.in).nextInt();
        return choice;
    }

    /**通过得到的学生集合进行添加操作*/
    public static void addStudent(ArrayList<Student> array) {
        System.out.println("----------执行添加学生功能----------");
        //提示并获取学生数量
        System.out.println("请输入待输入的学生数量：");
        int num = new Scanner(System.in).nextInt();

        System.out.println("-----------------------------------");
        for (int i = 1; i <= num; i++) {
            System.out.println("--------正在获取第" + i + "个学生的信息:-------");
            System.out.print("学号：");
            String sId = new Scanner(System.in).nextLine();
            System.out.print("姓名：");
            String name = new Scanner(System.in).nextLine();
            System.out.print("年龄：");
            int age = new Scanner(System.in).nextInt();
            System.out.print("居住地-地址：");
            String address = new Scanner(System.in).nextLine();
            if (searchsId(sId,name,array)){
                Student s = new Student(sId, name, age, address);
                if (array.add(s)) {
                    System.out.println("添加成功！");
                }else {
                    System.out.println("添加失败");
                }
            }else {
                i--;
                System.out.println("学号或姓名已存在！");
            }
        }
    }

    /**通过得到的学生集合进行删除操作*/
    public static void deleteStudent(ArrayList<Student> array) {
        System.out.println("--------执行删除学生功能--------");
        //键盘提示并获取录入要删除的学生学号
        System.out.println("请输入你要删除的学生的序号：");
        String sId = new Scanner(System.in).nextLine();

        //设定默认索引为异常值-1
        int index = -1;
        //执行循环查找存在的索引值并更新
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getsId().equals(sId)) {
                index = i;
                break;
            }
        }

        //判断索引值，并执行对应的操作
        if (index == -1){
            System.out.println("查无此人！");
        } else {
            array.remove(index);
            System.out.println("删除学号为" + sId + "的学生成功！");
        }
    }

    /**通过得到的学生集合进行修改操作*/
    public static void editStudent(ArrayList<Student> array) {
        System.out.println("--------执行修改学生功能--------");
        //键盘提示并获取录入要修改的学生学号
        System.out.println("请输入你要修改的学生的序号：");
        String sId1 = new Scanner(System.in).nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s1 = array.get(i);
            if (s1.getsId().equals(sId1)) {
                array.remove(i);
                System.out.println("--------正在获取学生的新信息:-------");
                System.out.print("新学号：");
                String sId2 = new Scanner(System.in).nextLine();
                System.out.print("新姓名：");
                String name2 = new Scanner(System.in).nextLine();
                System.out.print("新年龄：");
                int age2 = new Scanner(System.in).nextInt();
                System.out.print("新居住地-地址：");
                String address2 = new Scanner(System.in).nextLine();
                if (searchsId(sId2,name2,array)){
                    Student s2 = new Student();
                    s2.setsId(sId2);
                    s2.setName(name2);
                    s2.setAge(age2);
                    s2.setAddress(address2);
                    array.add(i, s2);
                    Student s = array.get(i);
                    if (s.getsId().equals(sId2) || s.getName().equals(name2) ||
                            s.getAge() == age2 || s.getAddress().equals(address2)) {
                        System.out.println("修改学生信息成功！");
                    }
                    break;
                }else {
                    i--;
                    System.out.println("学号或姓名已存在！");
                }
            }
        }
    }

    /**通过得到的学生集合进行打印操作*/
    public static void showStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询！");
            return;
        }

        System.out.println("--------执行查看所有学生功能--------");
        //遍历集合，使用通用遍历格式
        System.out.println("---------打印遍历学生信息----------");
        System.out.println("\t\t\t学号\t\t\t\t姓名\t\t\t年龄\t\t居住地地址");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.print("第" + (i + 1) + "个学生：");
            System.out.println("\t" + s.getsId() + "\t" + s.getName() + "\t\t" + s.getAge() + "岁\t" + s.getAddress());
        }
    }

    /**通过得到的学生id进行查询验重*/
    public static boolean searchsId(String sId,String name,ArrayList<Student> array) {
        boolean b = true;
        for (Student s : array) {
            if (s.getsId().equals(sId) || s.getName().equals(name)) {
                b = false;
                break;
            }
        }
        return b;
    }
}
