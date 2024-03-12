import java.util.Scanner;

public class P2675_문자열_반복 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int c = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < c; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
