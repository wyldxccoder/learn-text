package day1;
//测试类
//计算平均年龄,小于平均值打印出来
public class girlfrdenttest {
    public static void main(String[] args) {
        girlfrdent []arr = new girlfrdent[4];//建立数组arr存创建的对象----int[]arr=new int[4]
        girlfrdent g1 = new girlfrdent("范冰冰", 40, "女", "偷税");//创建对象
        girlfrdent g2 = new girlfrdent("一一", 18, "女", "撒娇");
        girlfrdent g3 = new girlfrdent("零零", 22, "女", "装可爱");
        girlfrdent g4 = new girlfrdent("畅畅", 20, "女", "美女");
        arr[0] = g1;//将创建的对象存入数组arr
        arr[1] = g2;
        arr[2] = g3;
        arr[3] = g4;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            girlfrdent g = arr[i];//遍历每个对象
            int age = g.getAge();//将每个对象中的年龄取出
            sum += age;
        }
        int avg = sum / arr.length;//计算平均年龄
        System.out.println(avg);
        for (int i = 0; i < arr.length; i++) {
            girlfrdent g = arr[i];//遍历每个对象
            int age = g.getAge();//将每个对象中的年龄取出
            if (age < avg) {   //如果小于平均年龄则打印出来
                System.out.println(g.getAge() + g.getGender() + g.getName() + g.getHooby());
            }

        }

    }
}