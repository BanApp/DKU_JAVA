public class Day_6 {

    public static void main(String[] args)
    {
        Calculator c1 = new Calculator();
        c1.setOprands(10,35);
        c1.sumDecoPlus();
        c1.sumDecoMinus();

        Calculator c2 = new Calculator();
        c2.sumDecoPlus();
        c2.sumDecoMinus();

        B b1 = new B();
        b1.d();

    }
}

class Calculator{
    //final은 값을 바꾸지 못하도록 한다.
    static final double PI = 3.14;

    //private 가장 엄격 같은 패키지 및 같은 클래스 안에서만
    private int left=1;
    private int right=3;

    //public 가장 자유롭게 사용
    public void setOprands(int left, int right){
        //this는 c1과 c2의 클래스 인스턴스를 구분하기 위해서 쓰인다.
        this.left = left;
        this.right = right;
    }
    private int _sum(){
        //클래스의 인스턴스 인지 아닌지가 명확해서 this 불필요
        return left+right;
    }
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++");
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}

//abstract(추상) 메소드가 하나라도 존재하면 추상 클래스가 된다.
abstract class A
{
    //내용이 있는 메소드는 abstract를 가질 수 없다..!
    public abstract int b();

    //final로 선언된 메소드는 오버라이딩이 불가능하다.
    //final로 선언된 클래스는 상속이 불가능하다.
    final void c() {

    }

    public void d()
    {
        System.out.println("Hello,World! I am Abstract class");
    }
}
//abstract 클래스를 상속으로 사용하면 메소드를 반드시 오버라이딩 해야한다.
class B extends A
{
    @Override
    public int b() {
        return 0;
    }

}

//인터페이스 선언
interface I
{
    //인터페이스에 존재하는 메소드 선언
    //멤버는 반드시 public 이어야 한다.(외부에서 조작해야 하기 때문)
    public void z();

}

interface V
{
    public void kk();
}

//인터페이스도 상속이 가능하다.
interface Z extends V
{
    public void ex();
}


//class I_use는 인터페이스 I를 구현한다.
class I_use implements I,V
{
    //인터페이스에 선언된 메소드를 구현하는 것을 강제한다.
    public void z()
    {
        System.out.println("This is Interface");
    }

    public void kk()
    {
        System.out.println("여러개의 인터페이스를 포함 할 수 있습니다.");
    }
}
