import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10818_최소_최대 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min=0;
        int max=0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }
        System.out.print(min+ " "+ max);
    }
}
