import java.util.Scanner;

public class Sandwitch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=sc.nextInt();
        int mid=(a/10)%10;
        if(a<1000 &&a>99 && mid%3==0){
            System.out.println("The number is trendy number");
        }
        else{
            System.out.println("the number is not trendy number");
        }
        sc.close();
    }
    
}
