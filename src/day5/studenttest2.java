package day5;
//键盘录入对象,对象存入集合然后遍历
import java.util.ArrayList;
import java.util.Scanner;

public class studenttest2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<student>list=new ArrayList<>();
        //键盘录入学生信息添加到集合中
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            student s=new student();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            s.setName(name);//录入学生对象姓名
            s.setAge(age);//录入学生对象年龄
            list.add(s);//将创建的对象存入集合
        }
        //遍历每一个对象
        for (int i = 0; i < list.size(); i++) {
            student stu = list.get(i);
            System.out.println(stu.getName()+","+stu.getAge());
        }
    }
}
