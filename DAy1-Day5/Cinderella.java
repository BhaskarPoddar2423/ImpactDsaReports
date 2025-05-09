import java.util.Scanner;
public class Cinderella {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr1[]=new int [n];
        int arr2[]=new int [m];
        int sum1 =0;
        int sum2 =0;
        System.out.println("Enter the elements of first array:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of Second array:");
        for (int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            sum1+=arr1[i];
            sum2+=arr2[i];
        }
        if(sum1==sum2 && n==m){
            System.out.println("same");
        }
        else{
            System.out.println("Not same");
        }
        sc.close();
    }
}
