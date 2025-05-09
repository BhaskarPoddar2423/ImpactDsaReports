import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp1=n;
        int temp2=n;
        int sum=0;
        int count=0;
        while(temp1>0){
            temp1/=10;
            count++;
        }
        while(temp2>0){
            sum+=Math.pow(temp2%10,count);
            temp2/=10;
        }
        if(sum==n)
        {
            System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }
        sc.close();
    }
}
