//함수를 사용, 기본 자료형 및 연산

//프로젝트의 이름(@@.java 파일의 @@ 과 클래스명이 동일해야함)

public class 1_Main {
    public static void main(String[] args) {
        System.out.println(6); //Int 6
        System.out.println("six"); //String
        System.out.println("6"); //String 6

        System.out.println(6 + 6); //12
        System.out.println("6" + "6"); //66

        System.out.println(6 * 6); //36
        //System.out.println("6"*"6"); //에러 발생
        
        aboutnum(); //함수 호출
        aboutstr(); // 함수 호출
    }

    public static void aboutnum() //숫자 관련 함수 선언
    {
        System.out.println(' ');
        System.out.println("#### This is \"aboutnum()\" function ####");
        System.out.println(6+2); //합
        System.out.println(6*2); //곱
        System.out.println(6/2); //나누기 몫
        System.out.println(6-2); //빼기
        System.out.println(6%3); //나누기 나머지

        //Math 라이브러리 사용
        double x = Math.PI; //변수형을 선언해줘야함
        double y = Math.abs(x * -15);
        System.out.println(x);
        System.out.println(y);

        int a = 1; //number -> integer
        int b = -2;
        int c = (a+b)*2;
        System.out.println(c);

        double d = 1.1515165; //실수는 float없이 double사용
        System.out.println(d);

        double e = 1.1;
        double f = 3;
        System.out.println(e);
        System.out.println(f);

        int g = (int)e; //타입캐스팅 double -> int
        double h = (double)5; //타입캐스팅 int -> double

        System.out.println(g);
        System.out.println(h);

        String s = Integer.toString(b); //-2를 string 으로
        String s2 = Double.toString(e); //1.1을 string 으로
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s2.getClass()); //자료형을 알려줌
    }

    public static void aboutstr() //문자 관련 함수 선언
    {
        System.out.println(' ');
        System.out.println("#### This is \"aboutstr()\" function ####");
        System.out.println("Hello, World!"); //String, 큰 따옴표
        System.out.println("Hello, \nWorld!"); //줄바꿈
        System.out.println("Hello, \"World!\""); //문자를 escape 시킴(\)

        System.out.println("Hello, World!".length()); //13(띄어쓰기도 문자로 취급)

        System.out.println('H'); //Char(문자), 작은 따옴표
        System.out.println("I love Coding!".replace("Coding","Chocolate"));

        String t = "This is Java Study!"; //String은 선언할때 대문자
        System.out.println(t);

        String name = "Minjun Jung"; //문장에 변수로 삽입
        System.out.println("This is "+name+"'s Java Study. This code is written by "+name+".");
    }

}

