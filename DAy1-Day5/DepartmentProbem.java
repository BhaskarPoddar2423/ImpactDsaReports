import java.util.*;
public class DepartmentProbem {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number row:");
        int row=sc.nextInt();
        System.out.println("enter the number col:");
        int col=sc.nextInt();
        System.out.println("enter the number Seat_no:");
        int seat_no=sc.nextInt();
        
        if (seat_no%col==0 || seat_no%col==1 || seat_no<=col){
            System.out.println("CSE");
        }
        else{
            System.out.println("ECE");
        }
        sc.close();
        
    }
}
