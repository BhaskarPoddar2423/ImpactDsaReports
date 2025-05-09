import java.util.Scanner;

public class EvenSum_Odd_Sum {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int even_sum=0;
        int odd_sum=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                even_sum+=digit;
            }
            else{
                odd_sum+=digit;
            }
            n/=10;
        }
        System.out.println("Even Sum: "+even_sum);
        System.out.println("Odd Sum: "+odd_sum);
        sc.close();
    }
}
