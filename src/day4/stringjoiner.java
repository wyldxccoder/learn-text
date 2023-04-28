package day4;
//stringjoiner和stringbuilder一样,是一个字符容器,创建后内容是可变的,提高字符串操作效率,没有空参构造
//更方便的拼接
import java.util.StringJoiner;
public class stringjoiner {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj=new StringJoiner(", ","[","]");
        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //3.计算长度
        int length = sj.length();
        //4.to string
        String s = sj.toString();

        System.out.println(sj);
        System.out.println(length);
    }
}
