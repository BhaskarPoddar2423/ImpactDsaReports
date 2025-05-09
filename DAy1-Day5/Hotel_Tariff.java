import java.util.Scanner;

public class Hotel_Tariff {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int even_sum=0;
        int odd_sum=0;
        while(n>0){
            int digit= n%10;
            n/=10;
            if(digit%2==0){
                even_sum+=digit;
            }
            else{
                odd_sum+=digit;
            }
        }
        System.out.println("Even sum is "+even_sum);
        System.out.println("Odd sum is "+odd_sum);
        sc.close();
    }   

}
