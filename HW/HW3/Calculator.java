import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("계산식을 입력하세요 (종료하려면 'quit'을 입력): ");
            input = scanner.nextLine();

            if (input.equals("quit")) {
                System.out.print("'quit'을 입력하셨습니다. 프로그램을 종료합니다. ");
                break;
            }

            String[] tokens = input.split(" ");
            double operand1 = Double.parseDouble(tokens[0]);
            double operand2 = Double.parseDouble(tokens[2]);
            String operator = tokens[1];

            switch (operator) {
                case "+":
                    System.out.printf(
                            "%f %s %f 의 계산 결과는 %f\n",
                            operand1,operator,operand2,add(operand1, operand2));
                    System.out.println();
                    break;
                case "-":
                    System.out.printf(
                            "%f %s %f 의 계산 결과는 %f\n",
                            operand1,operator,operand2,
                            subtract(operand1, operand2));
                    System.out.println();
                    break;
                case "*":
                    System.out.printf("%f %s %f 의 계산 결과는 %f\n",
                            operand1,operator,operand2,
                            multiply(operand1, operand2));
                    System.out.println();
                    break;
                case "/":
                    if (operand2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        System.out.println();
                    }
                    else {
                        System.out.printf("%f %s %f 의 계산 결과는 %f\n"
                                ,operand1,operator,operand2
                                ,divide(operand1, operand2));
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    System.out.println();
                    break;
            }
        }

        scanner.close();
    }

    public static double add(double operand1, double operand2) {
        return operand1 + operand2;
    }

    public static double subtract(double operand1, double operand2) {
        return operand1 - operand2;
    }

    public static double multiply(double operand1, double operand2) {
        return operand1 * operand2;
    }

    public static double divide(double operand1, double operand2) {
        return operand1 / operand2;
    }
}
