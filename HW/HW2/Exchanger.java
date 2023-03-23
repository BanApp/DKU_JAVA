import java.util.Scanner;

public class Exchanger {
    // 각 화폐의 환율 상수

    // 2023년 3월 22일 우리은행 기준 USD 환율 1307.80
    static final double DOLLAR_RATE = 1307.80;

    // 2023년 3월 22일 우리은행 기준 JPY 환율 988.60
    static final double YEN_RATE = 988.60;

    // 2023년 3월 22일 우리은행 기준 EUR 환율 1408.63
    static final double EURO_RATE = 1408.63;

    //main 함수
    public static void main(String[] args) {
        System.out.println("┌─────────────────────────────────────────────────────┐");
        System.out.println("                   프로그래밍 2분반 5조                    ");
        System.out.println("             <정민준, 박지연, 강민지, 권민지, 신다연>        ");
        System.out.println("        1.본 프로그램은 원화를 외화로 환전하는 프로그램입니다.     ");
        System.out.println("   2.KRW(₩)을 USD($), YEN(￥), EURO(€)로 환전 할 수 있습니다. ");
        System.out.println("       3.2023년 3월 22일 우리은행 고지환율을 기준으로 합니다.     ");
        System.out.println("└──────────────────────────────────────────────────────┘");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.print("1.환전 대상 화폐의 종류를 정수로 입력하세요 (1: $(USD), 2: ¥(YEN), 3: €(EUR)): ");
            int currencyCode = scanner.nextInt();

            System.out.print("2.환전하고자 하는 ₩(KRW)를 입력하세요: ");
            double krwAmount = scanner.nextDouble();

            String convertedResult = exchange(currencyCode, krwAmount);
            System.out.printf("3.%s\n",convertedResult);

            System.out.print("4.계속 할까요?(계속하려면 yes 멈추려면 no를 입력): ");
            String choice = scanner.next();
            System.out.println();

            if(choice.equals("no")) //문자열 no 입력시 break를 통해서 반복문 탈출
            {
                System.out.println("no를 입력하셨습니다. 프로그램을 종료합니다.");
                break;
            }
        }
        scanner.close();
    }

    // 환율에 따라 환산된 금액을 계산하여 반환하는 메소드
    static String exchange(int currencyCode, double krwAmount) {
        String unit = "";
        if(currencyCode == 1)
        {
            unit = "$(USD)";
            double result = krwAmount / DOLLAR_RATE;
            return String.format("%.2f ₩(KRW)은 %.2f%s 입니다.", krwAmount, result, unit);
        }
        else if (currencyCode == 2)
        {
            unit = "¥(YEN)";
            double result = krwAmount / YEN_RATE;
            return String.format("%.2f ₩(KRW)은 %.2f%s 입니다.", krwAmount, result, unit);
        }

        else if (currencyCode == 3)
        {
            unit = "€(EUR)";
            double result = krwAmount / EURO_RATE;
            return String.format("%.2f ₩(KRW)은 %.2f%s 입니다.", krwAmount, result, unit);
        }

        else //예외 처리
            return "환전 대상 화폐의 종류가 정확하지 않습니다. (1: USD, 2: YEN, 3: EURO)에서 선택해주세요.";
    }
}
