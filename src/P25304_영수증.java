import java.util.Scanner;

public class P25304_영수증 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int count = sc.nextInt();
        int total =0;

        for (int i = 1; i <= count; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            total +=  price * quantity ;

        }
        if (totalPrice == total) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
