package Work;

import java.util.Scanner;

public class Work6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int k = sc.nextInt();
        int mun=0;
        while (M--!=0){
            mun++;
            if(mun%k==0){
                M++;
            }
        }
        System.out.println(mun);
    }
}
