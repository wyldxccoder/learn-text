package day1;
//str.charAt(i)获取每一个字符的索引
//录取一个字符串,统计大写字符,小写字符,数字的个数
import java.util.Scanner;
public class stringcharat {
    public static void main(String[] args) {
        //录入一个字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = sc.next();
        //三个计数器
        int smallcount=0;
        int bigcount=0;
        int numcount=0;
        for (int i = 0; i < str.length(); i++) {  //s.length().fori
            //i表示字符的每一个索引
            char c = str.charAt(i);//遍历每一个字符
            System.out.println(c);//打印每一个字符
            if(c>='a'&&c<='z'){smallcount++;}
            else if (c>='A'&&c<='Z') {bigcount++;}
            else if (c>'0'&&c<'9'){numcount++;}

        }
        System.out.println("小写字符个数"+smallcount+"大写字符个数"+bigcount+"数字个数"+numcount);

    }
}
