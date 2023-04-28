package Work;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int digit=0;
        int letter=0;
        int other=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                digit++;
            }else if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                letter++;
            }else {
                other++;
            }
        }
        System.out.println("letter"+":"+letter);
        System.out.println("digit"+":"+digit);
        System.out.println("other"+":"+other);

    }
}
