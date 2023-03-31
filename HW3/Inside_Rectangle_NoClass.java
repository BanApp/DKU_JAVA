import java.util.Scanner;

public class Inside_Rectangle_NoClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter x: ");
            int x = scanner.nextInt();
            System.out.print("Enter y: ");
            int y = scanner.nextInt();

            if (isInsideRectangle(x, y))
            {
                System.out.println("(" + x + "," + y + ") " +
                        "is inside the rectangle");
            }
            else
            {
                System.out.println("(" + x + "," + y + ") " +
                        "is not inside the rectangle");
            }

            System.out.print("종료하라면 'quit'을 입력: ");
            String check = scanner.next();
            System.out.println();

            if(check.equals("quit"))
            {
                System.out.print("'quit'을 입력하셨습니다. 프로그램을 종료합니다. ");
                break;
            }
        }
        scanner.close();
    }

    public static boolean isInsideRectangle(int x, int y) {
        // 직사각형 왼쪽 상단 모서리의 좌표 (100, 100)
        int leftTopX = 100;
        int leftTopY = 100;
        // 직사각형 오른쪽 하단 모서리의 좌표 (200, 200)
        int rightBottomX = 200;
        int rightBottomY = 200;
        if (x >= leftTopX && x <= rightBottomX && y >= leftTopY &&
                y <= rightBottomY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
