import java.util.Scanner;

public class Inside_Rectangle_Class {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point leftTop = new Point(100, 100);// 직사각형 왼쪽 상단 모서리 좌표
        Point rightBottom = new Point(200, 200);// 직사각형 오른쪽 하단 모서리 좌표

        while (true) {
            System.out.print("Enter x: ");
            int x = scanner.nextInt();
            System.out.print("Enter y: ");
            int y = scanner.nextInt();

            Point p = new Point(x, y);
            if (isInsideRectangle(p, leftTop, rightBottom))
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

            if (check.equals("quit"))
            {
                System.out.print("'quit'을 입력하셨습니다. 프로그램을 종료합니다. ");
                break;
            }
        }
        scanner.close();
    }

    //좌표가 사각형 안에 존재하는지 판별 함수
    public static boolean isInsideRectangle(Point p, Point leftTop,
                                            Point rightBottom) {
        if (p.getX() >= leftTop.getX() && p.getX() <= rightBottom.getX()
                && p.getY() >= leftTop.getY() && p.getY() <= rightBottom.getY())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { //x좌표 반환
        return x;
    } //x좌표 반환

    public int getY() { //y좌표 반환
        return y;
    } //y좌표 반환
}


