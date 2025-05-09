import java.util.*;
public class reverse_digit {
    public static void main (String [] args)
    {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the  three digit number");
        int n=sc.nextInt();
        int f=n%10;
        int m=(n/10)%10;
        int l=n/100;
        int rev=(100*f)+(10*m)+(l);
        System.out.println(+rev);
        sc.close();
    }
}
