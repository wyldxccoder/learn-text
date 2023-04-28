package day3;
//判断是否对称 , 用反转
import java.util.Scanner;
public class stringtest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s1 = sc.next();
        StringBuilder sb=new StringBuilder(s1);//创建对象
        sb.reverse();//反转
        String s2 = sb.toString();//将StringBuilder转换为String
        if(s1.equals(s2)){
            System.out.println("是对称字符串");
        }else {
            System.out.println("不是对称字符串");
        }
    }
}
