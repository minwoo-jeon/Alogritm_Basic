import java.util.Scanner;

public class P5622_다이얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        int sum =0;

        for (int i = 0; i < input.length(); i++) {
            char a =input.charAt(i);

                switch (a) {
                case 'A' : case 'B': case'C':
                    sum += 3;
                    break;
            }   switch (a) {
                case 'D': case 'E': case'F':
                    sum += 4;
                    break;
            }   switch (a) {
                case 'G' : case 'H': case'I':
                    sum += 5;
                    break;
            }   switch (a) {
                case 'J' : case 'K': case'L':
                    sum += 6;
                    break;
            }   switch (a) {
                case 'M' : case 'N': case'O':
                    sum += 7;
                    break;
            }   switch (a) {
                case 'P' : case 'Q': case'R': case 'S':
                    sum += 8;
                    break;
            }   switch (a) {
                case 'T' : case 'U': case'V':
                    sum += 9;
                    break;
            }switch (a) {
                case 'W' : case 'X': case'Y': case 'Z':
                    sum += 10;
                    break;
           }


        }
        System.out.println(sum);
    }
}
