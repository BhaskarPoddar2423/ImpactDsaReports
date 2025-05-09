import java.util.Scanner;

public class Divisibility_check {
    public static int nearestInt(int num,int m){
        int q=num/m;
        int previous=q*m;
        int next=(q+1)*m;
        if (num-previous>next-num){
            return previous;
        }
        else if(num-previous<next-num){
            return next;
        }
        else{
            return Math.max(previous,next);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num:");
        int num=sc.nextInt();
        System.out.println("Enter a m:");
        int m=sc.nextInt();
        int result=nearestInt(num, m);
        System.out.println(+result);
        sc.close();
    }
}
