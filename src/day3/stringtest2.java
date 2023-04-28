package day3;
//5.链式编程 :一个方法的结果后面套用另一个方法 sb.append("aaa").append("aaa").reverse();
import java.util.Scanner;
//使用StringBuilder的场景:
//1.字符的拼接
//2.字符的反转
public class stringtest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s = sc.next();
        String result = new StringBuilder().append(s).reverse().toString();//StringBuilder链式编程
        if (s.equals(result)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }
}
