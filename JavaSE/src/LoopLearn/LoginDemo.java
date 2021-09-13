package LoopLearn;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author &
 */
public class LoginDemo {
    public static void main(String[] args) {
        String u = "root";
        String p = "root";

        System.out.println("请登录!您共有三次机会！");

        for (int i = 1; i <= 3; i++) {
            System.out.print("用户名：");
            String username = new Scanner(System.in).nextLine();
            if ("".equals(username)) {
                System.out.println("必须输入用户名！");
                return;
            }

            System.out.print("密码：");
            String password = new Scanner(System.in).nextLine();
            if ("".equals(password)) {
                System.out.println("必须输入密码！");
                return;
            }

            if (!Objects.equals(username, u) || !Objects.equals(password, p)) {
                System.out.println("用户名或密码错误！");
            } else {
                System.out.println("登陆成功！");
                break;
            }
            if (i == 3) {
                System.out.println("您的尝试次数已用尽！\n账户已被锁定，请与管理员联系！");
            } else {
                System.out.println("您还有" + (3 - i) + "次机会！");
                System.out.println("\n即将开始第" + (i + 1) + "次尝试：");
            }
        }

    }
}
