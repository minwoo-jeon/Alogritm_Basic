import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2480_주사위 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 모든 변수가 다른경우
        if (a != b && b !=c && a!= c) {
            int max;
            // a > b라면
            if (a > b) {
                //c > a> b 라면
                if (c > a) {
                    max =c ;
                 // a > (b,c)
                } else {
                    max = a;
                }
            }
            else{
                // c> b > a 라면
                if (c > b) {
                    max = c;
                }
                // b> (a.c)
                else{
                    max = b;
                }
            }
            System.out.println(max * 100);
        }
        // 적어도 한 쌍 이상의 서로 같은 변수가 존재할 경우
        else{
            // 3개의 변수가 모두 같은 경우
            if (a == b && a == c) {
                System.out.println(10000 + a * 1000);
            }
            else{
                //a가 b혹은 c랑 같은경우
                if (a == b || a == c) {
                    System.out.println(1000 + a *100);
                }
                // b가 c랑 같은경우
                else{
                    System.out.println(1000 + b * 100);
                }

            }
        }
    }
}
