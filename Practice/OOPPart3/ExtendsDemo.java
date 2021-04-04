/*
继承：
1。 子类只能继承父类的非私有成员（方法+变量） not private
2。 子类不能继承父类的构造方法， 但可以通过super关键字去访问父类构造方法。
 */
package Practice.OOPPart3;

class Fu{
    private int num = 100;
    public int num2 = 200;

    private void show(){
        System.out.println("show");
    }
    public void show2(){
        System.out.println("show2");
    }

}

class Zi extends Fu{

}
public class ExtendsDemo {
    public static void main(String[] args) {
        Zi z = new Zi();

        //System.out.println(z.num); //不能继承private
        System.out.println(z.num2);
        z.show2();

        Fu f = new Fu();
        System.out.println(f.num2);
        //System.out.println(f.num); //不能继承private


    }
}
