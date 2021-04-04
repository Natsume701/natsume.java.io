/*
多态成员访问特点：
    1。 成员变量
        编译看左边，运行看左边
    2。 成员方法
        编译看左边，运行看右边
        因为， 成员方法有重写，但是变量没有
    3。 静态方法
        编译看左边，运行看左边
        所以前面我说静态方法不能算方法的重写

 */
package Practice.duoTai;
class Animall {
    public int age = 40;

    public void show(){
        System.out.println("show animal");
    }

    public static void method(){
        System.out.println("method animal");
    }
}

class Dogg extends Animall{
    public int age = 20;

    public void show(){
        System.out.println("show dog");
    }

    public static void method(){
        System.out.println("method dog");
    }
}

public class DuoTaiDemo02 {
    public static void main(String[] args) {
        //多态
        Animall a = new Dogg(); //狗狗赋值给动物 // 40  跟随Animal
        System.out.println(a.age);
        a.show(); //show dog // 方法重写了， 所以， 看右边， Dogg
        a.method(); //method animal // static

    }
}
//40
//show dog
//method animal