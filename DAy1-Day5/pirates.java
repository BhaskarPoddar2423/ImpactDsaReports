import java.util.*;    
public class pirates {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins");
        int coins = sc.nextInt();
        System.out.println("Enter the Ben share");
        int ben = sc.nextInt();
        System.out.println("Enter the Blackbirds share");
        int blackbirds = sc.nextInt();

        int temp=coins;
        int share_of_ben = (ben*temp)/100;
        int share_of_blackbirds =(blackbirds*temp-share_of_ben)/100;
        int share_of_pirates = (temp-share_of_ben-share_of_blackbirds)/3;
        System.out.println(+ share_of_ben);
        System.out.println(+share_of_blackbirds);
        System.out.println(+share_of_pirates);

        sc.close();
    }
}
