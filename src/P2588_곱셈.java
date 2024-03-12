import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P2588_곱셈 {
    public static void main(String[] args)throws IOException {
    /*    Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        System.out.println(A*(B%10));
        System.out.println(A * (B % 100 / 10));
        System.out.println(A * (B / 100));
        System.out.println(A*B);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        char[] c = b.toCharArray();
        System.out.println(a * (c[2] - '0'));
        System.out.println(a * (c[1] - '0'));
        System.out.println(a * (c[0] - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}
