import java.util.*;
public class HarryPotter {
    public static void main(String []args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number on the door:");
        int n=a.nextInt();
        int x=n%10;
        int y=n/1000;
        int sum= x+y;
        System.out.println(+sum);
        a.close();
    }
}
