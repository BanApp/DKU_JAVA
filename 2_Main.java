//입출력, 배열, 반복문

import java.util.Scanner;

//입출력
public class 2_Main {
    public static void main(String[] args) {

        //배열 선언법 1
        int[] arr = {1,2,3,4,5};
        String[] s_arr ={"Hello","My","name","is","Minjun"};

        System.out.println(arr[0]);
        System.out.println(s_arr[2]);

        //배열 선언법2
        //double[] d_arr = {}; //오류 발생
        double[] d_arr = new double[3]; //정상적인 빈배열 선언
        d_arr[0] = 1.5;
        System.out.println(d_arr[0]);

        int sum =0;

        for(int i=0; i<arr.length; i++) //반복문은 C언어와 사용법이 유사함.
        {
            sum = sum + arr[i];
            System.out.println("sum = " + sum);
        }

        int[] input_arr = new int[5];

        int j = 0;
        Scanner sc = new Scanner(System.in); //입력 함수

        //while 문 C언어와 사용법 유사
        while (j < input_arr.length)
        {
            input_arr[j] = sc.nextInt();
            j++;
        }

        j = 0;
        while (j < input_arr.length)
        {
            System.out.printf("input_arr[%d] = ",j); //printf도 사용가능(C언어와 동일)
            System.out.println(input_arr[j]);
            j++;
        }

        //2차원 배열
        int[][] twodim_arr = new int[5][5];

        //2중 반복문
        for(int i=0; i<5; i++)
            for(int k=0; k<5; k++)
            {
                twodim_arr[i][k] = sc.nextInt();
            }

        for(int i=0; i<5; i++)
            for(int k=0; k<5; k++)
            {
                System.out.printf("twodim_arr[%d][%d]: ",i,k);
                System.out.println(twodim_arr[i][k]);
            }
    }
