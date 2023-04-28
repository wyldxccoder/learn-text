package Work;
//1200

import java.util.Scanner;

public class Work11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int m= sc.nextInt();
        int n= sc.nextInt();
        int []arr1=new int[m];
        int []arr2=new int[n];
        for (int i = 0; i < m; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i]=sc.nextInt();
        }
        int min=Math.abs(arr1[0]-arr2[0]);;
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr2.length; i1++) {
               if(Math.abs(arr1[i]-arr2[i1])<min){
                   min=Math.abs(arr1[i]-arr2[i1]);
               }
            }

        }
        System.out.println(min);
    }
}
