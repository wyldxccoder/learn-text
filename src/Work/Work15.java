package Work;

import java.util.Scanner;

public class Work15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int pow = (int) Math.pow(A, B);
            String s = Integer.toString(pow);
            if(s.length()>=3){
                String substring = s.substring(s.length() - 3);
                int i1 = Integer.parseInt(substring);
                System.out.println(i1);
                System.out.println();

            }
            else {
                System.out.println(pow);

            }
        }
    }
}
