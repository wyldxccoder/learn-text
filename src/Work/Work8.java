package Work;

import java.util.Scanner;

public class Work8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean answer=false;
        for (int i = 0; i <=n/5 ; i++) {
            for (int j = 0; j < n/3; j++) {
                int k=n-i-j;
                if(i*15+j*9+k==n*3){
                    answer=true;
                    System.out.printf("%4d %4d %4d",i,j,k);
                    System.out.println();
                }
            }
        }
        if(answer==false){
            System.out.println("No Answer");
        }
    }
}
