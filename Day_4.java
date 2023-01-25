import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//클래스,메소드
public class Day_4 {
    public static String glob = "I am Global!"; //전역 변수 선언

    public static void main(String[] args) throws IOException {
        IO_PS a2 = new IO_PS("A2"); //인스턴스 생성
        other_method();
        my_method();
        a2.print(glob); //전역 변수 호출
        second.str_conditional(); //다른 클래스에 존재하는 메소드 호출
    }

    //다른 메소드를 호출
    public static int other_method() throws IOException
    {
        //class: System, Math, FileWriter
        //instance: f1,f2

        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8)); //올림
        System.out.println(Math.ceil(1.8)); //내림

        FileWriter f1 = new FileWriter("data.txt");
        //상태를 가지고 있는 복제본(instance), 새로운 객체(class)를 생성

        f1.write("Hello");
        f1.write("JAVA");
        f1.close();

        return 0;
    }
    //메소드를 직접 제작
    public static void my_method()
    {
        IO_PS a1 = new IO_PS("A1"); //인스턴스 생성
        String delimeter = "****"; //지역변수

        //print 메소드는 non-static이라서 인스턴스 생성후 사용
        a1.print(delimeter); //메소드 호출 및 변수 삽입
        a1.print(glob); //전역 변수 호출

        int answer = a1.adder(3,5); //덧셈 메소드 호출 후 반환값 저장
        a1.print(String.valueOf(answer)); //string 형태로 변환 뒤 출력

        int new_answer;
    }
}

class IO_PS
{
    public String Init = "";
    public IO_PS(String Init)
    {
        this.Init = Init; //this로 메소드안에 있는 변수를 가리킨다.
    }
    //print라는 메소드 선언
    //static은 class 종속(IO_PS.print() 이렇게 사용)
    //non-static의 경우 instance를 생성해서 사용해야 한다.(위의 a1.print())
    public void print(String delimter)
    {
        System.out.println(delimter);
    }

    //덧셈 메소드 선언
    public int adder(int x, int y) //static이 있으면 클래스에 종속됨
    {
        int ans = x+y + 20;
        return ans;
    }
}
