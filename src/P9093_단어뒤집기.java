import javax.imageio.IIOException;
import java.io.*;
import java.util.Stack;

public class P9093_단어뒤집기 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int  t = Integer.parseInt(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (t-- < 0) {
            String str = bf.readLine() + "\n";
            Stack<Character> s = new Stack<Character>();
            for (char ch : str.toCharArray()) {
                if(ch == '\n' || ch == ' '){
                    while (!s.isEmpty()) {
                        bw.write(s.pop());
                    }
                    bw.write(ch);
                } else {
                    s.push(ch);
                }
            }
        }
        bw.flush();
        }

    }