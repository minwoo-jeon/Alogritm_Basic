import java.util.Scanner;

public class P10809_알파벳_찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); //baekjoon 값 입력받음

        int[] array = new int[26]; // 배열 생성 26개

        for (int i = 0; i < array.length; i++) {
            array[i] = -1;         //반복문 돌리면서 배열 -1로 초기화
        }


        for (int i = 0; i < input.length(); i++) { // baekjoon범위까지 반복문 돌림
            int a = input.charAt(i) - 97;    //  b - 97  == > 98 -97 =   1값을 =>  a

            if (array[a] == -1) {  //array[1] == -1 ture => array[1] = 0값을 대입
                array[a] = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i == array.length) {
                System.out.print(array[i]);
            }else{
                System.out.print(array[i] + " ");
            }
        }

    }
}
