import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10818_최소_최대1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());  //첫줄 N은 안쓰므로 입력므로 입력만 받는다
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -10000001;
        int min = 100001;

        while (st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            }
        }
        System.out.println(min + " " + max);
    }
}