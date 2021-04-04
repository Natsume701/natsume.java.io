/*
1:Override和Overload的区别?Overload能改变返回值类型吗?
	Override:重写
	Overload:重载

	方法重写：子类中出现和父类中一模一样的方法声明的现象。
	方法重载：同一个类中出现的方法名相同，参数列表不同的现象。

	Overload能改变返回值类型，因为它和返回值类型无关。

2:this关键字和super关键字分别代表什么?以及他们各自的使用场景和作用。
	this:本类对象的引用
	super:父类存储空间的标识。(可以理解为父类对象的引用)

	使用场景：
		成员变量：
			this.变量 本类的成员变量
			super.变量 父类的成员变量
		构造方法：
			this(...) 本类的构造方法
			super(...) 父类的构造方法
		成员方法：
			this.方法名(...) 本类的成员方法
			super.方法名(...) 父类的成员方法
 */
/*
方法重写的注意事项：
A - 子类中私有方法不能被重写
B - 子类重写父类方法时，访问权限不能更低， 建议一样
C - 父类静态方法，子类也必须通过静态方法进行重写
 */
package Practice.method;

class Person{
    public void show(){
        System.out.println("show person");
    }
    private void show2(){ // private类型
        System.out.println("show2 person");
    }
    public void show3(){
        System.out.println("show3 person");
    }
    public static void show4(){ // 父类中的静态方法
        System.out.println("show4 person");
    }
}

class Student extends Person{
    public void show(){
        System.out.println("show student");
    }
    private void show2(){
        System.out.println("show2 student");
    }
    public void show3(){
        System.out.println("show3 student");
    }
    public static void show4(){
        System.out.println("show4 student");
    }

/*
    @Override
    public void show() {
        super.show();
    }

    @Override
    public void show3() {
        super.show3();
    }

 */

}


public class PersonDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        //s.show2(); private不可以
        s.show3();
        s.show4();

    }
}
//show student
//show3 student
//show4 student