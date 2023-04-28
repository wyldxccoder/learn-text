package day3;
//StringBuilder可以看作是一个字符容器,创建后内容是可变的,有空参构造,String不可变
public class stringbuilder {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb=new StringBuilder();//创建一个空参对象
        //1.拼接
        sb.append("aaa");
        sb.append("bbb");
        // 2.反转
        sb.reverse();
        //3.获取长度
        int length = sb.length();
        //4.将StringBuilder转换为String
        String str = sb.toString();


        System.out.println(str);
        System.out.println(length);

    }
}
