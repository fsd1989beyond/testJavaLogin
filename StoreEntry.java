package itheima.test._02;

import javax.naming.NamingEnumeration;
import java.util.ArrayList;
import java.util.Scanner;
public class StoreEntry {
    private static final String GOODS_INFO_FILE_PATH = "itheima_javase_exam\\goods.txt" ;


    public static void main(String[] args) {

        // 创建用户集合的对象
        ArrayList<User> users = new ArrayList<User>() ;

        while(true) {

            // 商城用户注册和登录界面
            System.out.println("--------------------------欢迎访问ITHEIMA购物商城-------------------------------");
            System.out.println("1. 登录");
            System.out.println("2. 注册");
            System.out.println("3. 退出");

            // 请输入您的选择
            System.out.println();
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in) ;
            String next = sc.next();

            // 选择
            switch (next) {
                case "1" :
                    // TODO
                    boolean result = login(users);
                    if(result) {
//                        System.out.println("登录成功....");
                        // 商品管理
                        goodsManager();
                        break ;
                    }else {
                        System.out.println("用户名或者密码错误,请重新输入您的选择....");
                        break;
                    }

                case "2" :
                    // TODO
                    register(users);
                    break ;
                case "3" :
                    // TODO
                    System.out.println("谢谢使用，欢迎下次光临");
                    System.exit(0);
                    break;
                default:
                    System.out.println("不存在您的选择，请重新输入！");

            }

        }
    }

    // 商品管理系统
    private static void goodsManager() {

        while(true) {

            // 商品管理
            System.out.println("--------------------------商品管理模块-------------------------------");
            System.out.println("1: 添加商品");
            System.out.println("2: 查询商品");
            System.out.println("3: 退出");
            System.out.println("--------------------------商品管理模块-------------------------------");

            // 请输入您的选择
            System.out.println();
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in) ;
            String next = sc.next();

            // 选择
            switch(next) {
                case "1" :
                    // TODO
                    addGoods();
                    break ;
                case "2" :
                    // TODO
                    findAllGoods();
                    break ;
                case "3" :
                    // TODO
                    System.out.println("谢谢使用，欢迎下次光临");
                    System.exit(0);
                    break ;
                default:
                    System.out.println("不存在您输入的选择，请重新输入....");
                    break;
            }

        }

    }

    /**
     * 查询所有的商品信息
     */
    private static void findAllGoods() {


    }

    // 添加图书信息，使用文件存储商品信息
    private static void addGoods() {

    }

    /**
     * 商品数据保存到文件中
     * @param goods
     */
    private static void storeGoodsInfoToFile(Goods goods) {

        // 向文件中写数据


    }

    // 登录操作
    private static boolean login(ArrayList<User> users) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输出用户名：");
        String s = sc.nextLine();
        System.out.println("请输入密码：");
        String s1 = sc.nextLine();
        User user = new User(s,s1);
        if (user.equals(users)) {
            return true;
        }else {
            return false;
    }

    // 注册
    private static void register(ArrayList<User> users) {
            ArrayList<User> users1 = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入你的选择");
        String next = sc.nextLine();
        System.out.println("请输入用户名：");
        String s3 = sc.nextLine();
        System.out.println("请输入密码：");
        String s4 = sc.nextLine();
        User user1 = new User(s3,s4);
        users1.add(user1);
        System.out.println("注册成功...");
        login(users);


    }


}

    // 判断用户名是否存在
    private static boolean isUsed(ArrayList<User> users , String userName) {
        if (userName.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

}
