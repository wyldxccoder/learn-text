package Work;

import java.util.Scanner;

public class Work7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int up= sc.nextInt();
        int down = sc.nextInt();
        int sum=0;
        while (high>0){
            high=high-up;
            if(high>=0){sum++;
            }
            high=high+down;
        }
        System.out.println(sum);
    }
}
