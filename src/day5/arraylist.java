package day5;
//ArrayList 只能存(引用数据类型)和(包装类),集合可以自动增长和缩短,初始长度为0,数组不能
import java.util.ArrayList;
/*boolean add(E e)     添加
boolean remove(E e)    删除
E remove(int index)
E set(int index,E e)   修改
E get(int index)       查询
int  size()            获取长度
 */
public class arraylist {
    public static void main(String[] args) {
        //1.创建集合的对象
        ArrayList <String> list=new ArrayList<>();
        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");//结果[aaa,bbb,ccc,ddd]
        //3.删除元素
        list.remove("aaa");//删除aaa  结果[bbb,ccc,ddd]
        list.remove(1);//删除 [bbb,ccc,ddd]索引为1的ccc  结果[bbb,ddd]
        //4.修改元素
        list.set(0,"ccc");//0索引的bbb修改为ccc,结果[ccc,ddd]
        //5.查询元素
        String result = list.get(0);//查询[ccc,ddd]0索引的 ccc
        System.out.println(result);
        System.out.println(list);
        //6.遍历
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
