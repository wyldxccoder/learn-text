package day2;
//设计一个方法将int[]arr={1,2,3}变成[1,2,3]
public class stringDemo2 {
    public static void main(String[] args) {
        int []arr= {1,2,3};
        String str=arrtostring(arr);
        System.out.println(str);

        }
        public static String arrtostring( int []arr){
        if(arr==null){
            return "";
        }
        if(arr.length==0){
            return "[]";
        }
       String result="[";
            for (int i = 0; i < arr.length; i++) {

            if(i==arr.length-1){result=result+arr[i];}
            else {result=result+arr[i]+", ";}

            }result=result+"]";
            return result;
        }
    }

