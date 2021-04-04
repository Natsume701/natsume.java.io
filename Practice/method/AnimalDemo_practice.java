/*
	练习2：请把猫狗案例改为继承的版本，自己分析，自己测试。等会讲

	猫：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx()，show()，catchMouse()
	狗：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx()，show()，lookDoor()

	动物：
		成员变量：姓名，年龄
		构造方法：无参，带参
		成员方法：getXxx()/setXxx()，show()

	猫：构造方法：无参，带参
		catchMouse()
	狗：构造方法：无参，带参
		lookDoor()

	测试类：
		main(String[] args):

 */
package Practice.method;

class Animal{
    //成员变量：姓名，年龄
    private String name;
    private int age;

    //构造方法：无参，带参
    public Animal(){ }
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //成员方法：getXxx()/setXxx()，show()
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println(name+"----"+age);
    }
}

	// 猫：构造方法：无参，带参
            //catchMouse()
class Cat extends Animal{
    public Cat(){ }

    public Cat(String name, int age){
        super(name, age); //重写父类成员
    }

    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}

//狗：构造方法：无参，带参
//		lookDoor()
class Dog extends Animal{
    public Dog(){}
    public Dog(String name, int age){
        super(name, age);
    }

    public void lookDoor(){
        System.out.println("狗可以看门");
    }
}

public class AnimalDemo_practice {
    public static void main(String[] args) {
        // 猫类测试
        Cat c = new Cat();
        c.setName("娘口三三");
        c.setAge(1000);
        c.show();
        c.catchMouse();
        System.out.println("------------");

        Cat cc = new Cat("日向翔阳", 16);
        cc.show();
        cc.catchMouse();
        System.out.println("=============");

        Dog d = new Dog();
        d.setName("虎杖悠仁");
        d.setAge(15);
        d.show();
        d.lookDoor();
        System.out.println("--------------");
        Dog dd = new Dog("嘿嘿", 21);
        dd.show();
        dd.lookDoor();
        System.out.println("===========");
    }
}
/*
娘口三三----1000
猫捉老鼠
------------
日向翔阳----16
猫捉老鼠
=============
虎杖悠仁----15
狗可以看门
--------------
嘿嘿----21
狗可以看门
===========
 */
