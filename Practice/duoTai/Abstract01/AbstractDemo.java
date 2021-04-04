/*
抽象类特点:
    A - 抽象类和抽象方法必须用abstract关键字修饰

    格式
    abstract class 类名 {}
    public abstract void eat();
    B - 抽象类不一定有抽象方法，有抽象方法的类一定是抽象类
    C - 抽象类不能实例化
        那么，抽象类如何实例化呢?
        按照多态的方式，由具体的子类实例化。其实这也是多态的一种，抽象类多态。
    D - 抽象类的子类, 要么是抽象类, 要么重写抽象类中的所有抽象方法
 */
package Practice.duoTai.Abstract01;
abstract class Animal{ //抽象类不一定有抽象方法，有抽象方法的一定是抽象类
    //抽象方法
    public abstract void eat();
}
abstract class Dog extends Animal{

}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        /*Animal a = new Animal() {
            @Override
            public void eat() {

            } //不重写就无法实例化
        }

         */
    }
}
