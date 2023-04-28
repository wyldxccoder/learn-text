package day1;
//标准Javabean类
/*1.私有化成员变量
2.空参构造方法
3.带全部参数的构造方法
4.get/set成员方法
 */
public class girlfrdent {
    private String name;
    private int age;
    private String gender;
    private String hooby;
    public girlfrdent(){}//空参构造
    public girlfrdent(String name,int age,String gender,String hooby){ //
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.hooby=hooby;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public  String getGender(){
        return  gender;
    }
    public void setHooby(String hooby){
        this.hooby=hooby;
    }
    public String getHooby(){
        return hooby;
    }

}
