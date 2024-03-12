import java.util.Scanner;

public class P10810_공_넣기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //바구니 개수
        int m = sc.nextInt(); // 공을 넣는 방법의 수

        int[] arr = new int[n + 1]; // +1해주기

        //3개의 정수 입력 받기(시작,끝 /공번호)

        int start = 0;
        int end = 0 ;
        int ball = 0;

        // M만큼 start, end,ball을 입력 받아야 함으로 for 문 사용해 입력받고, 공의 번호를  arr배열에 저장
        for (int i = 0; i < m; i++) {
            start =  sc.nextInt();
            end = sc.nextInt();
            ball = sc.nextInt();

            //입력받은 공의 번호를 start부터 end까지 저장
            for (int j = start; j <= end; j++) {
                arr[j] = ball;
            }
        }
        //바구니 안에값 출력
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
