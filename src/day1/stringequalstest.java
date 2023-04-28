package day1;
//用户登录
import java.util.Scanner;
public class stringequalstest {
    public static void main(String[] args) {
        String username = "wang";
        String pasword = "123456";
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String rightname = sc.next();
            System.out.println("请输入密码");
            String rightpasword = sc.next();
            String next = sc.next();
            if(username.equals(rightname) && pasword.equals(rightpasword)){
                //比较username和rightname的内容是否相同,比较pasword和rightpasword的内容是否相同
                System.out.println("用户登录成功");
                break;
            }
                else {
                System.out.println("用户登录失败,请重新输入."+"你还剩"+(2-i)+"次机会");}
                if(i==2){
                    System.out.println("你的账户已被锁定");
                }

            }

        }

    //替换
    public static class stringreplace {
        public static void main(String[] args) {
            String talk="你玩的很好,以后不要再玩了,他妈的";
            String newtalk=talk.replace("他妈的","***");//把他妈的替换为***
            System.out.println(newtalk);
        }
    }
}

