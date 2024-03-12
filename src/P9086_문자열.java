import java.util.Scanner;

public class P9086_문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //테스트 케이스의 개수
        int t = sc.nextInt();
        String[] arr = new String[t];

        //문자열 입력받기
        for (int i = 0; i < arr.length; i++) {
            String str = sc.next();
            arr[i] = str.substring(0, 1) + str.substring(str.length() - 1, str.length());
        }
        sc.close();

        for (String s : arr) {
            System.out.println(s);
        }

        }
    }

