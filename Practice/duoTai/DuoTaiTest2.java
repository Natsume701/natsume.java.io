package Practice.duoTai;

class A{
    public void show(){
        show2();
    }
    public void show2(){
        System.out.println("我");
    }
}
class B extends A{

    public void show2(){
        System.out.println("爱");
    }
}
class C extends B{
    @Override
    public void show() {
        super.show();
    }

    public void show2() {
        System.out.println("你");
    }
}
public class DuoTaiTest2 {
    public static void main(String[] args) {
        A a = new B();
        a.show(); //爱

        B b = new C();
        b.show(); //你

        //方法看右边的

    }
}
