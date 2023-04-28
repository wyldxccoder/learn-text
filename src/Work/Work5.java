package Work;

import java.util.Scanner;

public class Work5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int fan;
        int x=m;
        int y=n;
        while (m%n!=0){
            fan=m%n;
            m=n;
            n=fan;
        }
        //保证精确度,应该先除后乘
        System.out.print(n+" ");
        System.out.print(y/n*x);
    }
}
