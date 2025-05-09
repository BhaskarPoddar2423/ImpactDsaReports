import java.util.Scanner;

public class Compatible {
        public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr[]=new int[n1];
        int arr1[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n2;i++)
        {
            arr1[i]=sc.nextInt();
        }
        if(n1==n2){
            for(int j=0; j<n1;j++){
                if(arr[j]<=arr1[j])
                {
                    System.out.println("compatible");
                }
                else{
                    System.out.println("not compatible");
                }
            }
        }
        sc.close();
    }
}
