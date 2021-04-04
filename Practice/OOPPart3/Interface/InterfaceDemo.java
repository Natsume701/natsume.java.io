/*
1：成员区别
	抽象类：
		成员变量：可以是变量，也可以是常量
		构造方法：有
		成员方法：可以是抽象的，也可以是非抽象的
	接口：
		成员变量：只能是常量。
			默认修饰符：public static final
		成员方法：只能是抽象的
			默认修饰符：public abstract

2：关系区别
	类与类：
		继承关系，只能单继承。可以多层继承。
	类与接口：
		实现关系，可以单实现，也可以多实现。
		还可以在继承一个类的同时实现多个接口。
	接口与接口：
		继承关系，可以单继承，也可以多继承。

3：设计理念区别
	抽象类：被继承体现的是：”is a”的关系。在抽象类中定义的一般是共性功能
	接口：被实现体现的是：”like a”的关系。在接口中定义的一般是扩展功能

接口特点
    接口用关键字interface表示
        格式：interface 接口名 {}
    类实现接口用implements表示
        格式：class 类名 implements 接口名 {}
    接口不能实例化
        那么，接口如何实例化呢?
        按照多态的方式，由具体的子类实例化。其实这也是多态的一种，接口多态。
    接口的子类
        要么是抽象类
        要么重写接口中的所有抽象方法

interface - 体现扩展功能
 */
package Practice.OOPPart3.Interface;
/*
interface Animal{
    public abstract void show();
}


 */
abstract class God implements Animal{
}
class Cat implements Animal{
    public void show(){}
}

public class InterfaceDemo {
    public static void main(String[] args) {

    }
}
