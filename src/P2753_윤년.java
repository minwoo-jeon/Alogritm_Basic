import java.util.Scanner;

public class P2753_윤년 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.close();

        if (y % 4 == 0) { //조건 1
            if (y % 400 == 0) { //조건2
                System.out.println("1"); //조건식 1과 조건식 2가 서로 true 이면 환
            } else if (y % 100 == 0) { //조건 3
                System.out.println("0");  //조건식 1과 조건식 3이 서로 true일경우
            }else{
                System.out.println("1"); //조건식 1과 100의 배수가 아닌애들
            }
        }else{
            System.out.println("0");  //조건식 1번이 false일경우
        }
    }
}
