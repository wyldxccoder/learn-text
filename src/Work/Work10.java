package Work;

import java.util.Arrays;
import java.util.Scanner;

public class Work10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int i1 = sc.nextInt();

                for (int i2 = 1; i2 <= i1; i2++) {
                    if(i2 % 10 == 7||i2%7==0||i2/10%10==7||i2/100%10==7||i2/1000%10==7){
                        System.out.print(i2+" ");
                    }
                }
            System.out.println();

        }
    }
}
