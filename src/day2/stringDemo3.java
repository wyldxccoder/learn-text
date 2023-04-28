package day2;
//反转字符串 abc  cba
import java.util.Scanner;

public class stringDemo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s1=sc.next();
       String result= fanzhuan(s1);
        System.out.println(result);
    }
    public static String fanzhuan(String s){
        String result="";
        for (int i = s.length()-1; i >= 0; i--) {
            char c = s.charAt(i);//遍历每一个字符 倒序
            result=result+c;
        }
            return result;
        }


    }


