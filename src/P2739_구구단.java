import java.util.Scanner;

public class P2739_구구단 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            int total = a * i;
            System.out.println(a +" * "+ i +" = " + total );
        }


    }
}
