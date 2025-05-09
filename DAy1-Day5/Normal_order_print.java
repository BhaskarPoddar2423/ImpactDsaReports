public class Normal_order_print {
    public static void main(String [] args){
        int n=4567;
        int reverse=0;
        while(n>0){
            int last=n%10;
            reverse=(reverse*10)+last;
        }
        
    }
}
