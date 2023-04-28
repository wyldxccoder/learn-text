package day5;
//查询id用户信息是否存在
import java.util.ArrayList;
import java.util.List;

public class usertset {
    public static void main(String[] args) {
            //创建集合
            ArrayList<user>list=new ArrayList<>();
            //创建对象
            user u1=new user(1,"开心",123);
            user u2=new user(2,"高兴",456);
            user u3=new user(3,"幸福",789);
            //将对象存入集合
            list.add(u1);
            list.add(u2);
            list.add(u3);
            //调用方法
        boolean result = getid(list,3);
        System.out.println(result);
    }

    public static boolean getid( ArrayList<user>list,int id){


        //遍历每个对象
        for (int i = 0; i < list.size(); i++) {
            user u = list.get(i);//遍历每个对象
            int uId = u.getId();
            if(uId==id){
                return true;
            }
        }
return false;
    }
}
