import java.util.Scanner;

public class condition {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int a= sc.nextInt();
        if (a<=20){
            System.out.println("less than or equals to 20"); 
        }
        else if(a>20){
            if (a%2==0)
            {
                System.out.println("greater than 20 and even");
            }
            else{
                System.out.println("greater than 20 and odd");
            } 
        }
        else if ( a<10 || a>99){
            System.out.println("number is invalid");
        }
        sc.close();
    }
}
