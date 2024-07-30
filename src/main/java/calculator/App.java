package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요. : ");
            char operator = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            // 입력받은 양의 정수와 사칙연산 기호를 사용해 연산한 후 결과값 출력하기
            int result = 0;
            switch(operator){
                case ('+'): result = num1 + num2; break;
                case ('-'): result = num1 - num2; break;
                case ('*'): result = num1 * num2; break;
                case ('/'): result = num1 / num2; break;
            }
            System.out.println("결과: " + result);
            System.out.println("계산을 종료하려면 exit를 입력해 주세요.");
            Scanner sc2 = new Scanner(System.in);
            String exit = sc2.nextLine();
            if(exit.equals("exit")) {break;}
            else {
                System.out.println("계속 계산합니다.");
            }
        }
        System.out.println("연산이 종료되었습니다.");



        // 반복문을 사용하여 "exit"를 입력하기 전까지 반복해서 작동하게 만들기






    }
}