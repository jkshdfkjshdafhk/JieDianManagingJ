import java.util.*;
public class Main {
    public static void main(String[] args) {
        int choice;
        System.out.println("                     你好，我的朋友!");
        System.out.println("                  欢迎使用节点财资管理器");
        System.out.println("****************************************************************************" );
        System.out.println("请问您需要什么服务");
        System.out.println("                  1) 设置金格" );
        System.out.println("                  2) 花费");
        System.out.println("                  3) 收入");
        System.out.println("                  4) 查看金格");
        System.out.println("                  5) 退出" );
        System.out.printf(">>");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        Managing m = new Managing();
        while (choice != 5) {
            switch (choice) {
                case 1:
                    int bm;
                    System.out.printf("0即退出到主界面>>");
                    bm = scanner.nextInt();
                    while (bm != 0) {

                        m.setMoney(bm);
                        System.out.printf("0即退出到主界面>>");
                        bm = scanner.nextInt();
                    }
                    break;
                case 2:
                    int sm;
                    System.out.printf("0即退出到主界面>>");
                    sm = scanner.nextInt();
                    while (sm != 0) {

                        m.spendMoney(sm);
                        System.out.printf("0即退出到主界面>>");
                        sm = scanner.nextInt();
                    }
                    break;
                case 3:
                    int mm;
                    System.out.printf("0即退出到主界面>>");
                    mm = scanner.nextInt();
                    while (mm != 0) {

                        m.makeMoney(mm);
                        System.out.printf("0即退出到主界面>>");
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
            System.out.printf(">>");
            choice = scanner.nextInt();

        };

    }

}