public class Collatz_Sequence {
    public static void main(String[] args){
        int n=5;
        int count=0;
        while(n>0){
            if(n%2==0){
                n=n/2;
                count++;
            }
            else{
                n=3*n+1;
                count++;
            }
        }
        System.out.println("The Collatz sequence is:");
        System.out.println(+count);
    }
}