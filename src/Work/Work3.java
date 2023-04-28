package Work;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char []arr=new char[s.length()];
        char result;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                result = (char) (s.charAt(i) + 32);
                arr[i] = result;
            }else{
                arr[i]=s.charAt(i);
            }
        }
        System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>='a'&&arr[i]<'z'){
                result=(char) (arr[i]+1);

            }else if(arr[i]=='z'){
                result=(char) (arr[i]-25);

            }else if(arr[i]=='@'){
                return;
            }
            else {
                result=arr[i];

            }
            System.out.print(result);
        }
    }
}
