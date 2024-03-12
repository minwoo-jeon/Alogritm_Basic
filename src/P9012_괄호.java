import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class P9012_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 6을 입력받는다

        for (int i = 0; i < 6; i++) {
            System.out.println(solve(sc.next()));  //((()())
        }
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "NO";
            }else {
                stack.pop();
            }
        }
        if (stack.empty()) {
            return "YES";
        } else{
            return "NO";
        }
    }

}