package day5;

public class student {
    private String name;
    private int age;
    public student(){}
    public student(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void setName(String name){
      name= this.name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        age=this.age;
    }
    public  int getAge(){
        return age;
    }
}
