package day1;
//字符串做比较
public class stringequals {
    public static void main(String[] args) {
        String s1="abc";
        String s2=new String("Abc");
        //1.比较内容是否相等,数据类型比较数据,引用类型(数组,字符串,创建的对象)比较地址
        System.out.println(s1==s2);
        //2.比较s1,s2内容是否相等
        System.out.println(s1.equals(s2));
        //3.比较s1,s2内容是否相等,忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));

    }
}
