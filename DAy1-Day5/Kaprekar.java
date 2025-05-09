import java.util.Scanner;

public class Kaprekar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int sq=n*n;
        int temp=n;
        int sum_left=0;
        int sum_right=0;
        int count=0;
        while(temp>0){
            temp/=10;
            count++;
        }
        sum_right=sq%(int)Math.pow(10,count);
        sum_left=sq/(int)Math.pow(10,count);
        if (n==sum_left+sum_right){
            System.out.println(n+" is keprekar number");
        }
        else{
            System.out.println(n+" is not a keprekar number");
        }
        sc.close();
    }

}
