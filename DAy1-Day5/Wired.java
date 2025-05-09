public class Wired {
    public static void main(String[] args) {
        int n=4;
        if (n%2==0){
            if(n>=2 && n<=5 ){
                System.out.println("not wired");
            }
            else if(n>=6 && n<=20){
                System.out.println("wired");
            }
            else{
                System.out.println("not wired");
            }
        }
        else{
            System.out.println("wired");
        }
    }
}
