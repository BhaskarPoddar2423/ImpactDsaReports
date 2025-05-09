import java.util.Scanner;

public class Sum_single {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
            if (sum>=10 && n==0)
            {
                n=sum;
                sum=0;
            }
        }
        System.out.println(+sum);
        sc.close();
    }
}
