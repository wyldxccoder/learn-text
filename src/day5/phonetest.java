package day5;

import java.util.ArrayList;

public class phonetest {
    public static void main(String[] args) {
        //创建对象
        ArrayList<phone>list=new ArrayList<>();
        //创建集合
        phone p1=new phone("小米",2999);
        phone p2=new phone("华为",7999);
        phone p3=new phone("锤子",1999);
        //将对象存入集合
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //调用方法
        ArrayList<phone> phoneArrayList = listgetphoneifo(list);
        //遍历集合
        for (int i = 0; i < phoneArrayList.size(); i++) {
            phone phone = phoneArrayList.get(i);
            System.out.println(phone.getBrand()+","+phone.getPrice());
        }


    }
    public static ArrayList<phone>listgetphoneifo(ArrayList<phone>list){
        //定义一个resultlist集合存手机价格3000元以下的手机对象
        ArrayList<phone>resultlist=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            phone p = list.get(i);//遍历每个对象
            int price = p.getPrice();
            //如果手机价格低于三千,就把他存入resultlist集合中
            if(price<3000){
                resultlist.add(p);
            }
        }
        //返回集合resultlist
        return resultlist;
    }



}
