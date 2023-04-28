package day3;
//设计一个方法将{1,2,3}转化为[1.2.3],用拼接
public class stringtest3 {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        String s = arrtostring(arr);
        System.out.println(s);
    }
        public static String arrtostring(int[]arr){
            StringBuilder sb=new StringBuilder();//创建对象
            sb.append("[");
            for (int i = 0; i < arr.length; i++) {
                if(i==arr.length-1){
                   sb.append(arr[i]);
                }else {sb.append(arr[i]).append(",");}
               String str=sb.toString();
            }
            sb.append("]");
            return sb.toString();
        }


    }

