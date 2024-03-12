import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P10828_스택 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt(); //테스트 케이스 횟수 입력을 받는다
        int[] stack = new int [n]; //스택 배열 생성
        int size=0;  //배열의 크기가 아니라 스택의크기 즉 0번쨰부터 시작

        while (n-- > 0) {
            String cmd =sc.next();  // next() = > 스페이스 전까지 받은 문자열을 리턴한다  :: nextLine() 스페이스 상관없이 엔터치기전까지 문자열을 리턴함
            if (cmd.equals("push")) {
                int num = Integer.parseInt(sc.next());
                stack[size++] = num;
            }else if(cmd.equals("top")){
                if (size == 0) {
                    bw.write("-1\n");
                }else{
                    bw.write(stack[size-1]+"\n");
                }
            } else if (cmd.equals("size")) {
                bw.write(size+"\n");
            }else if(cmd.equals("empty")){
                if (size == 0) {
                    bw.write("1\n");
                }else{
                    bw.write("0\n");
                }
            } else if (cmd.equals("pop")) {
                if (size == 0) {
                    bw.write("-1+\n");
                }else {
                    bw.write(stack[size - 1]+"\n");
                    size -= -1;
                }
            }
        }
        bw.flush();

    }

}

