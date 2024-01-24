import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class P9012_괄호 {
    public static void main(String[] args)  {

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(solve(in.next()));
        }
    }


    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return "No";
            }else {
                stack.pop();
            }
        }

        if (stack.empty()) {
            return "YES";
        }else {
            return "NO";
        }
    }
}