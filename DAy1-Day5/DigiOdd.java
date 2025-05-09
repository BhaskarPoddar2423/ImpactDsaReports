import java.util.*;
public class DigiOdd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n =sc.nextInt();
        int x=0;
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int digit_count=0;
            while (temp>0)
            {
                temp=temp/10;
                digit_count++;

            }
            if(digit_count%2!=0){
                x++;
            }
        }
        System.out.println(+x);
        sc.close();        
    }
}
