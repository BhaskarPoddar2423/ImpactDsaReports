import java.util.Scanner;
public class Solution
{
    public static String department(int x,int y){
        if (x%y==0 || x%y==1 || x<=y)
        {
            return "CSE";
        }
        else
        {
            return "ECE";
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row=sc.nextInt();
        System.out.println("Enter the number of col:");
        int col=sc.nextInt();
        System.out.println("Enter the seat number:");
        int seat_no=sc.nextInt();
        
        String result=department(seat_no,col);
        System.out.println(result);
        sc.close();
    }
}
