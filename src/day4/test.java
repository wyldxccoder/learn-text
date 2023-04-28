package day4;

public class test {
    public static void main(String[] args) {
        String A="adceb";
        String B="acedb";

        boolean b = check(A, B);
        System.out.println(b);

    }
    //通过翻转看String A和String B是否能匹配成功
    public static boolean check(String A,String B){
        for (int i = 0; i < A.length(); i++) {
          A = rodate(A);
            if(A.equals(B)){
                return true;
            }
        }
        return false;
    }

    //通过substring截取,进行翻转---abcde->bcdea
    public static String rodate( String str){
        char first=str.charAt(0);
        String end = str.substring(1);
        return end+first;
    }

}

