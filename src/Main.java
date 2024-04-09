import java.util.*;
public class Main {
    public static void main(String[] args) {
        int choice;
        System.out.println("                     你好，我的朋友!");
        System.out.println("                  欢迎使用节点财资管理器");
        Scanner scanner = new Scanner(System.in);
        Sign_up user = new Sign_up();
        user.sign_up("admin","admin");
        if(user.ifEmpty()){
            System.out.println("                       请先注册");
            System.out.print("请输入您的用户名，以便注册>>");
            String usernamesi = scanner.nextLine();
            System.out.print("请输入您的密码，以便注册>>");
            String passwordsi = scanner.nextLine();
            System.out.print("请确认您的密码，以便注册>>");
            String passwordsi2 = scanner.nextLine();
            while (!passwordsi.equals(passwordsi2)){
                System.out.print("请输入您的密码，以便注册>>");
                passwordsi = scanner.nextLine();
                System.out.print("请确认您的密码，以便注册>>");
                passwordsi2 = scanner.nextLine();
            }

            user.sign_up(usernamesi, passwordsi);

        }else {
            System.out.println("                       请先登录");



            System.out.print("请输入您的用户名，注册请输入0>>");
            String username = scanner.nextLine();
            System.out.println(username);
            if (username.equals("0")) {
                System.out.print("请输入您的用户名，以便注册>>");
                String usernamesi = scanner.nextLine();
                System.out.print("请输入您的密码，以便注册>>");
                String passwordsi = scanner.nextLine();
                System.out.print("请确认您的密码，以便注册>>");
                String passwordsi2 = scanner.nextLine();
                while (!passwordsi.equals(passwordsi2)) {
                    System.out.print("请输入您的密码，以便注册>>");
                    passwordsi = scanner.nextLine();
                    System.out.print("请确认您的密码，以便注册>>");
                    passwordsi2 = scanner.nextLine();
                }

                user.sign_up(usernamesi, passwordsi);

            } else {
                Login login = new Login();
                System.out.print("请输入您的密码，以便登录>>");
                String password = scanner.nextLine();
                while (!login.logIn(username, password) ) {
                    System.out.println("用户名或密码错误，请重输");
                    System.out.print("请输入您的用户名，以便登录>>");
                    username = scanner.nextLine();
                    System.out.print("请输入您的密码，以便登录>>");
                    password = scanner.nextLine();
                }
                System.out.println("登录成功，欢迎回来");
            }
        }
        System.out.println("****************************************************************************" );
        System.out.println("请问您需要什么服务？");
        System.out.println("                  1) 设置金格" );
        System.out.println("                  2) 花费");
        System.out.println("                  3) 收入");
        System.out.println("                  4) 查看金格");
        System.out.println("                  5) 退出" );
        System.out.print(">>");
        choice = scanner.nextInt();
        Managing m = new Managing();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    int bm;
                    System.out.print("0即退出到主界面>>");
                    bm = scanner.nextInt();
                    while (bm != 0) {

                        m.setMoney(bm);
                        System.out.print("0即退出到主界面>>");
                        bm = scanner.nextInt();
                    }
                    break;
                case 2:
                    int sm;
                    System.out.print("0即退出到主界面>>");
                    sm = scanner.nextInt();
                    while (sm != 0) {

                        m.spendMoney(sm);
                        System.out.print("0即退出到主界面>>");
                        sm = scanner.nextInt();
                    }
                    break;
                case 3:
                    int mm;
                    System.out.print("0即退出到主界面>>");
                    mm = scanner.nextInt();
                    while (mm != 0) {

                        m.makeMoney(mm);
                        System.out.print("0即退出到主界面>>");
                        mm = scanner.nextInt();
                    }
                    break;
                case 4:
                    System.out.println(m.getMoney());
                    break;
                default:
                    System.out.println("错误");
            }
            System.out.println("****************************************************************************" );
            System.out.println("请问您需要什么服务？");
            System.out.println("                  1) 设置金格" );
            System.out.println("                  2) 花费");
            System.out.println("                  3) 收入");
            System.out.println("                  4) 查看金格");
            System.out.println("                  5) 退出" );
            System.out.print(">>");
            choice = scanner.nextInt();

        }
    scanner.close();
    }

}