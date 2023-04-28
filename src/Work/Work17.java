package Work;

import java.util.Scanner;

public class Work17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int count=n;
     while (n>=3){
         count=count+n/3;
         n=n/3+n%3;
     }
        System.out.println(count);
    }
}
