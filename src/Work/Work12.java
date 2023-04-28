package Work;

import java.util.Scanner;

public class Work12 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
           int sum=1;
            for (int i = 0; i < n; i++) {
                int i1 = sc.nextInt();
                if(i1%2!=0){
                    sum=i1*sum;
                }
            }
            System.out.println(sum);
        }
    }
}
