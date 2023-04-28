package Work;

import java.util.Scanner;

public class Work9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       while (sc.hasNextInt()){
           int i1 = sc.nextInt();
           int i2 = sc.nextInt();
           if (i1==0&&i2==0){
               continue;
           }
           System.out.println(i1+i2);
       }
    }
}
