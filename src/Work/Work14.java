package Work;


import java.util.Scanner;

public class Work14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String s1 = s.substring(6, 11);
            sb.append("6").append(s1);
            System.out.println(sb);
            sb.delete(0,6);

        }
    }
}
