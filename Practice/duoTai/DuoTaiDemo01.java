/*
多态概述
    某一个事物，在不同时刻表现出来的不同状态。
    举例：
        猫可以是猫的类型。猫 m = new 猫();
        同时猫也是动物的一种，也可以把猫称为动物。
            动物 d = new 猫(); 把右边赋值给左边
        在举一个例子：水在不同时刻的状态 - 水，冰，水蒸气
多态前提和体现
    有继承关系
    有方法重写
    有父类引用指向子类对象

通过猫这个小动物，说猫可以被称为猫，也可以被称为动物。
在不同时刻，猫表现出的不同状态，来说明多态。
 */
package Practice.duoTai;

class Animal{
    public void eat(){
        System.out.println("动物吃饭");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃肉");
    }
}

public class DuoTaiDemo01 {
    public static void main(String[] args) {
        //Animal a = new Animal();
        // Dog d = new Dog;

        //多态
        Animal aa = new Dog(); // 狗赋值给动物

    }
}
