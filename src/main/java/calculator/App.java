package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // 과제 피드백
        // 아래쪽 배열 한칸 미는 for 문의 조건에서 상수 9 대신 배열의 길이 이용해 보기
        // int[] savedresult 를 List(ArrayList)로 바꾸고 어떤 것이 바뀌는지 알아보기.
        Scanner sc = new Scanner(System.in);

        int result = 0;
        ArrayList<Integer> savedresult = new ArrayList<Integer>();

        while (true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요. : ");
            char operator = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            // 입력받은 양의 정수와 사칙연산 기호를 사용해 연산한 후 결과값 출력하기

            switch(operator){
                case ('+'): result = num1 + num2; break;
                case ('-'): result = num1 - num2; break;
                case ('*'): result = num1 * num2; break;
                case ('/'): result = num1 / num2; break;
            }
            System.out.println("결과: " + result);

            // 연산 결과 저장하기
            savedresult.add(result);

            // 먼저 저장된 연산 결과 삭제하기
            System.out.println("가장 오래된 연산 결과를 삭제하려면 remove를 입력해 주세요.");
            savedresult.remove(0);

            // 저장된 연산 결과 출력
            System.out.println(savedresult.toString());





            System.out.println("계산을 종료하려면 exit를 입력해 주세요.");
            Scanner sc2 = new Scanner(System.in);
            String exit = sc2.nextLine();
            if(exit.equals("exit")) {break;}
            else {
                System.out.println("계속 계산합니다.");
            }
        }
        System.out.println("연산이 종료되었습니다.");


    }
}