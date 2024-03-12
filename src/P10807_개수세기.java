import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10807_개수세기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] =  Integer.parseInt(st.nextToken());
        }
        int count=0;
        int lastNum = Integer.parseInt(bf.readLine());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == lastNum) {
                count++;
            }
        }
        System.out.println(count);
    }


}

