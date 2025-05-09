import java.util.*;
public class Special_number {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            int pro=1;
            int sum=0;
            int temp=i;
            while(temp>0){
                sum+=temp%10;
                pro*=temp%10;
                temp /=10;
            }
            if(i==(sum+pro)){
                System.out.println(i+" is a special number");
            }
            else{
                System.out.println(i+" is not a special number");
            }
        }
        sc.close();
    }
}
