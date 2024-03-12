import java.util.Scanner;

public class P10950_AB3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int count = sc.nextInt();
        int arr[] = new int[count];

        for (int i = 0; i < count; i++) {
            int a =sc.nextInt();
            int b =sc.nextInt();
            arr[i] = a + b;
        }
        sc.close();

        for (int k : arr) {
            System.out.println(k);
        }
    }
}
