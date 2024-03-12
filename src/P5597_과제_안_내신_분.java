import java.util.Scanner;

public class P5597_과제_안_내신_분 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[31];

        for (int i = 1; i < 28; i++) {
            arr[sc.nextInt()]++;
        }


       for (int i = 1; i <= 30; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
