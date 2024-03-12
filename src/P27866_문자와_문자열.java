
import java.io.IOException;
import java.util.Scanner;


public class P27866_문자와_문자열 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        int n = sc.nextInt()-1;

        System.out.println(st.charAt(n));

        sc.close();
    }
}
