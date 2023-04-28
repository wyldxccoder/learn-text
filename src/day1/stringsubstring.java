package day1;
//substring 截取
public class stringsubstring {
    public static void main(String[] args) {
        String number="13663785145";
        String start= number.substring(0,3);//substring 根据索引截取  包头不包尾,包左不包右
        String end=number.substring(7);
        String result=start+"****"+end;
        System.out.println(result);


    }
}
