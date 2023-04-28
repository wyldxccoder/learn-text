package day1;

public class phonetest {
    public static void main(String[] args) {
        phone []arr=new phone[3];//创建存入对象的数组arr
        phone p1=new phone("小米",1999,"白色");//创建对象
        phone p2=new phone("华为",4999,"黑色");
        phone p3=new phone("魅族",1999,"蓝色");
        arr[0]=p1;//将创键的对象存入数组arr中
        arr[1]=p2;
        arr[2]=p3;
       int  sum=0;
        for (int i = 0; i < arr.length; i++) {
            phone p= arr[i];//遍历每个对象
            sum +=p.getPrice();//将每个对象中的手机价格取出
        }
        int avg=sum/ arr.length;
        System.out.println("平均价格为"+avg);
    }

}


