package Work;



import java.util.Scanner;

public class Work16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 2; i < n-1; i++) {
            if(prime(i)!=0&&prime(n-i)!=0&&i<=n-i){
                System.out.print(i);
                System.out.print(" ");
                System.out.println(n-i);
            }
        }

    }
    public static int prime(int x){
        int i;
        int k;
        if(x==1){
            return 0;
        }
        k= (int) Math.sqrt(x);
        for (int i1 = 2; i1 <= k; i1++) {
            if(x%i1==0){
                return 0;
            }
        }
        return 1;
    }
}
