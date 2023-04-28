package Work;

import java.util.Scanner;

public class Work13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            sb.append(s.charAt(6)).append(s.charAt(7)).append(s.charAt(8))
                    .append(s.charAt(9)).append("-")
                    .append(s.charAt(10)).append(s.charAt(11)).append("-").append(s.charAt(12)).append(s.charAt(13)).append("\n");


        }
        System.out.println(sb);
        sb.delete(0,10);
        System.out.println();


    }
}
