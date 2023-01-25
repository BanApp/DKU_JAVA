// 조건문, 반복문, 배열

import java.util.Objects;

public class Day_3 {
    public static void main(String[] args) {
        num_conditional();
        str_conditional();
        iter();
    }

    public static void num_conditional() {
        //숫자 데이터 조건문
        int x = 170;
        Objects.equals(x, 170); //원시데이터 객체는 이렇게 판별

        if (x < 170) {
            System.out.println("평균 이하입니다.");
        } else if (x == 170) {
            System.out.println("평균 입니다.");
        } else {
            System.out.println("평균 이상입니다.");
        }
    }

    public static void str_conditional() {
        //문자 데이터 조건문
        String id = "jmj0801";
        String input_id = new String("jmj0801"); //메모리에 새롭게 생성
        String pw = "0801";
        String input_pw = "0801";

        System.out.println(input_id == id); // ==은 객체의 주소값 비교
        System.out.println(input_id.equals(id));
        //.equals()는 원시데이터 타입이 아닌 객체의 값 자체를 비교

        if (input_id.equals(id) && input_pw.equals(pw)) {
            System.out.println("로그인 되었습니다!");
        } else if (input_id.equals(id) && !input_pw.equals(pw)) {
            System.out.println("비밀번호를 확인해주세요!");
        } else if (!input_id.equals(id) && input_pw.equals(pw)) {
            System.out.println("아이디를 확인해주세요");
        } else {
            System.out.println("아이디와 비밀번호를 확인해 주세요");
        }

    }

    public static void iter()
    {
        //배열 선언 방법1
        int[] arr = new int[5];
        String[] users = new String[3]; //Heap영역에 생성, Call By Refernce

        // 배열 선언 방법2
        int[] arr_2 = {1,2,3,4,5};

        //반복문
        int i = 1;
        while (i<6)
        {
            if(i%2==0)
                System.out.println("짝수!");
            else
                System.out.println("홀수!");
            i++;
        }

        for(int j=0; j<5; j++)
            arr[j] = j+2;

        for(int k = 0; k<arr.length; k++)
            System.out.println(arr[k]);
    }
}
