package _1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* 알고리즘 기초 100제 1번
-학생 정보 들을 저장하고 , 학생이름으로 검색했을떄 학번을 출력하는 프로그램을 작성하라
- studnet 클래스 생성
- studnet name , no 를 가짐 (이름과 학번)
- 학생들을 ArrayList에 저장한 이후
- 계속 검색을 하겠느냐 y - > 반복
- 종료하고싶은면 n -> 프로그램종료

- 학생 이름이 없는 경우 그 학생의 학번을 출력
- 학생 이름이 없으면, 없는 학생이름이라고 출력.

 */

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("김계란", 171234);
        Student student2 = new Student("범프리카", 181234);
        Student student3 = new Student("철구", 191234);


        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        for (Student student : list) {
            System.out.println("학생이름:" + student.getName() +" 학번 : " + student.getNo());
        }





        Scanner scan = new Scanner(System.in);



        while (true) {
            System.out.println("계속 검색을 하고싶으면 y, 종료하고싶으면 n");
             String input =scan.next();

            if (input.equals("y")) {
                System.out.println("검색을 시작합니다..");
                String name =  scan.next();
                boolean flag = false;

                for (Student student : list) {
                    if (name.equals(student.getName())) {
                        System.out.println("학번 :" + student.getNo());
                        flag = true;
                    }
                }

                if (!flag) {
                    System.out.println("해당하는 학생 이름이 없습니다.");
                }


            } else if (input.equals("n")) {
                break;

            } else {
                System.out.println("잘못입력하셨습니다.");
            }


        }//while
        System.out.println("프로그램을 종료합니다");

        }


    }

