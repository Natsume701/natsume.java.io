package Practice.duoTai.DuoTaiPart2;
/*
多态的好处：
    A - 提高了程序的维护性（由继承保证）
    B - 提高了 程序的扩展性（由多态保证）

多态的弊端：
    不能访问子类特有的功能
 */

class Animal{
    public void eat(){ }
    public void sport(){}
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void sport(){
        System.out.println("狗跑步");
    }
    public void lookDoor(){
        System.out.println("看门");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void sport(){
        System.out.println("猫和老鼠捉迷藏");
    }
}

class Pig extends Animal{
    public void eat(){
        System.out.println("猪吃肉");
    }
    public void sport(){
        System.out.println("猪爱睡觉");
    }
}

public class DuoTaiDemo {
    public static void main(String[] args) {
        //养很多只狗， 每只狗都要调用一些方法或者一些操作
        //操作是一样的，仅仅是狗的对象不一样
        //优化：
        Dog d = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        printAnimal(d);
        printAnimal(d2);
        printAnimal(d3);
        System.out.println("============");


        Cat c = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        printAnimal(c);
        printAnimal(c2);
        printAnimal(c3);
        System.out.println("==============");

        Pig p = new Pig();
        Pig p2 = new Pig();
        Pig p3 = new Pig();
        printAnimal(p);
        printAnimal(p2);
        printAnimal(p3);


    }

    private static void printAnimal(Animal a) {
        //Animal a = new Dog(); cat pig
        a.eat();
        a.sport();

    }
}
//狗吃肉
//狗跑步
//狗吃肉
//狗跑步
//狗吃肉
//狗跑步
//============
//猫吃鱼
//猫和老鼠捉迷藏
//猫吃鱼
//猫和老鼠捉迷藏
//猫吃鱼
//猫和老鼠捉迷藏
//==============
//猪吃肉
//猪爱睡觉
//猪吃肉
//猪爱睡觉
//猪吃肉
//猪爱睡觉