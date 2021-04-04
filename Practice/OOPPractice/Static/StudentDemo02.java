package Practice.OOPPractice.Static;

/*
static关键字
作用： 修饰成员变量和成员方法
特定：   1。 随着类的加载而加载
        2。 优先于对象存在
        3。 被类的所有对象共享
            这一条也是我们判断是否使用static关键字的条件

        4。 可以通过类名调用
                我们的调用既可以是对象，也可以是类名
 */

class Student2{
    public void show(){
        System.out.println("show");
    }

    public static void show2(){//此方法被static关键字修饰
        System.out.println("show2");
    }
}
public class StudentDemo02 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.show(); //show
        s.show2(); //show2

        Student2.show2(); //show2
        //Student2.show();没有被static修饰，不可使用
    }
}
//show
//show2
//show2
