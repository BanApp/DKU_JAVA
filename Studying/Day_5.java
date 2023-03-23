
class cal_p
{
    public int plus(int x, int y)
    {
        return x+y;
    }

    //메소드 오버로딩(같은 메소드에 매개변수의 형태가 다름 이것으로 구분)
    //근본적으로 상속과 관계 없다.
    public int plus(int x, int y, int z)
    {
        //this는 현재 클래스의 메소드 호출
        //매개변수의 종류, 개수에 맞는 조건을 따라서 객체를 찾아간다
        return this.plus(x,y)+z;
    }
}

class cal extends cal_p
{
    int a = 200;
    int b = 300;

    public void this_value()
    {
        int a = 1200;
        int b = 1300;

        System.out.println("a: "+a);
        System.out.println("b: "+b);

        //변수명이 동일할때 this는 메소드 안에 존재하는 변수를 호출
        //객체의 인스턴스 변수
        System.out.println("this.a: "+ this.a);
        System.out.println("this.b: "+this.b);
    }

    //메소드 오버라이딩(부모 클래스의 메소드 재정의)
    public int plus(int x, int y)
    {
        System.out.println(x+y+1); //15

        //super는 부모 클래스의 객체를 가리킨다.
        return super.plus(x,y); //14
    }

    public void minus(int x, int y)
    {
        System.out.println(x-y);
    }

    public void gob(int x, int y)
    {
        System.out.println(x*y);
    }

}

class origin
{
    int v1,v2;
    origin(int v1, int v2)
    {
        this.v1 = v1;
        this.v2 = v2;
        System.out.println("origin init!");
    }
}

class origin_ext extends origin
{
    origin_ext(int v1, int v2) {
        super(v1, v2); //부모 생성자 초기화
        System.out.println("origin_ext init!");
        System.out.println(this.v1); // 5
        System.out.println(super.v1); // 부모 생성자도 본인의 값으로 초기화(5)
    }
}

public class Day_5 {

    public static void main(String[] args)
    {
        cal c = new cal();
        cal_p old = new cal_p();

        c.this_value();

        System.out.println(old.plus(5,3));

        //오버로딩된 메소드 호출
        System.out.println(old.plus(1,2,3));

        System.out.println(c.plus(11,3));
        c.minus(11,3);
        c.gob(11,3);

        origin o1 = new origin(1,2);
        origin_ext o2 = new origin_ext(5,6);

    }
}
