package day5;

public class Test {


    public static void main(String[] args) {
        Course c1=new Course();
        Course c2=new Course();
        Course c3=new Course();
        c1.coursename="数据库";
        c2.coursename="数据结构";
        c3.coursename="java程序设计";
        c1.coursenumber=1;
        c2.coursenumber=2;;
        c1.show();
        c2.show();
        c3.show();
    }
}
