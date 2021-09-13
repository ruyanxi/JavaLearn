package Tools;

import java.util.Scanner;

/**
 * @author 朢曐
 * @date 2021/8/23
 * 用于检测输入框的值是否符合要求
 * 如密码框要求必须要有一个大写字母和一个小写字母，且必须大于8位
 */
public class ValidateBox {
    public static void main(String[] args) {
        int title = 0;
        while (title == 0){
        //获取密码框内容
        System.out.print("请设置密码：");
        String pwd = new Scanner(System.in).nextLine();
        System.out.print("确认密码：");
        String pwd2 = new Scanner(System.in).nextLine();

        //设定统计量:依次为：数字、大写字母、小写字母、中文、特殊字符
        int[] str = stringCount(pwd);

        int numberCount = str[0];
        int capitalCount = str[1];
        int lowercaseCount = str[2];
        int chineseCount = str[3];
        int specharsCount = str[4];

        /*System.out.println("该字符串共有"
                +capitalCount+ "个大写字母、"
                +lowercaseCount+ "个小写字母、"
                +numberCount+ "个数、"
                +chineseCount+ "个汉字及"
                +specharsCount+ "个特殊字符");*/
        if (pwd.length() < 8 || pwd.length()>16) {
            System.out.println("密码长度不符合要求!请输入8-16位密码！");
        } else if (chineseCount != 0 || capitalCount == 0 || lowercaseCount == 0) {
            System.out.println("输入不符合要求，至少包含一个大写字母和一个小写字母，且不能有中文汉字。");
        } else if (!pwd.equals(pwd2)){
            System.out.println("两次密码不一致！");
        } else {
            title++;
            System.out.println("密码设置成功！");
            System.out.println("密码为"+pwd);
            System.out.println("该字符串共有"
                    +capitalCount+ "个大写字母、"
                    +lowercaseCount+ "个小写字母、"
                    +numberCount+ "个数、"
                    +chineseCount+ "个汉字及"
                    +specharsCount+ "个特殊字符");
            break;
        }
            System.out.println("-----请重新设置密码-----");
        }
    }

    public static int[] stringCount(String str) {
        //设定统计量及预设值:依次为：数字、大写字母、小写字母、中文、特殊字符
        int numberCount = 0;
        int capitalCount = 0;
        int lowercaseCount = 0;

        int chineseCount = 0;
        int specharsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numberCount++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                capitalCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowercaseCount++;
            } else if (str.charAt(i) >= '\u4e00' && str.charAt(i) <= '\u9fa5') {
                chineseCount++;
            } else {
                specharsCount++;
            }
        }
        return new int[]{numberCount, capitalCount, lowercaseCount, chineseCount, specharsCount};
    }

}
