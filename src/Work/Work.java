package Work;
import java.util.Scanner;
public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //将int类型转化为string类型
        String s = Integer.toString(n);
        /*  String s = n + "";*/
        //将字符串装入数组中
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            //charAt遍历每个字符
            arr[i] = s.charAt(i);
        }
        //判断首字符是不是负号
        int a=0;
        if (arr[0] == '-') {
            //是负号就从第二个字符开始遍历
            for (int i = 1; i < arr.length; i++) {
                //利用ascll码算出每个每个字符对应数字,乘以相应的10次方得出该字符对应数值;
                //将所有数值相加得出绝对值
             a= (int) (((int) arr[i]-48)*Math.pow(10, arr.length-i-1))+a;
            }
            System.out.println(a);
        } else {
            //不是负号就从第一个字符开始遍历
            for (int i = 0; i < arr.length; i++) {
                a= (int) (((int) arr[i]-48)*Math.pow(10, arr.length-i-1))+a;
            }
            System.out.println(a);
        }
    }
}
