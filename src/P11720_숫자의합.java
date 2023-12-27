import java.util.Scanner;

public class P11720_숫자의합 {
    // 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다. 백준 11720번
    //바로 코딩하지 않고 문제 주어진 내용,조건을 파악하고 방향설정하기.
    //주의 * 만약  N개의 숫자가 100개의 숫자의 개수가 나오면 데이터타입 을 int, long 형으로 받을수없음
    // int 값 범위 =>2,147,483,647  , long 값 범위 => 9223372036854775807 생각.햐

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray(); //String.toCharArray() => 문자열을 한글자씩 쪼개서 char 타입에 배열에 집어 넣어주는 메서드
        int sum = 0;
        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';      //아스키코드로 값을 뺴넨 인덱스형 문자형을 int 형으로 바꿈. 문자 0은 아스키코드 -> 48표기 sa
        }
        System.out.println(sum);
    }
}
