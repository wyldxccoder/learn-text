package Work;

import java.util.Scanner;

public class Work2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*String s = n + "";*/
        String s = Integer.toString(n);
        int []arr=new int[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i]-48)+" ");
        }
    }
}
