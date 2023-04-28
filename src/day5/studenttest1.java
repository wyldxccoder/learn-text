package day5;
//将对象存入集合中,遍历
import java.util.ArrayList;
public class studenttest1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<student>list=new ArrayList<>();
        //创建学生对象
        student s1=new student("张三",23);
        student s2=new student("李四",24);
        student s3=new student("王五",25);
        //将创建的对象存在集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        //遍历每个对象
        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }

}
