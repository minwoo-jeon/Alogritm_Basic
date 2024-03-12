import java.util.Scanner;

public class P10813_공바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //바구니 개수
        int m = sc.nextInt(); //반복횟수
        int arr[] = new int[n+1]; //바구니는 1부터 시작하니깐 +1해줌

        //배열 초기화
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        //반복횟수
        for (int j = 0; j < m; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tem;

             tem = arr[a];
             arr[a] =arr[b];
             arr[b] =tem;
        }

        // 배열 값 출력
        for (int k = 1; k <= n; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}