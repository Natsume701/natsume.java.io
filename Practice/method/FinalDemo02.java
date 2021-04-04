/*
final关键字面试题
 final修饰局部变量
    在方法内部，该变量不可以被改变
    在方法声明上，分别演示基本类型和引用类型作为参数的情况
        基本类型，是值不能被改变
        引用类型，是地址值不能被改变

 final修饰变量的初始化时机
    在对象构造完毕前即可


 */
package Practice.method;

class Personn{
    public void show(){
        //局部变量
        int num=10;
        System.out.println(num); //10
        num=100;
        System.out.println(num);// num可以被重新赋值 //100

        //final修饰局部变量
        final int num2 = 20;
        System.out.println(num2); //20
        //num2 = 200;
        System.out.println(num2); //不可被重新赋值 //20
    }

    public void method(){
        //局部变量
        Studentt s1 = new Studentt();
        System.out.println(s1.age); //10
        s1.age = 100;// 重新赋值
        System.out.println(s1.age); //100

        //final修饰局部变量
        final Studentt s2 = new Studentt();
        System.out.println(s2.age); //10
        s2.age = 200;
        System.out.println(s2.age); //200
        //引用类型，是地址值不能被改变
    }
}

class Studentt{
    int age =10;
}

public class FinalDemo02 {
    public static void main(String[] args) {
        Personn p = new Personn();
        p.show();
        p.method();
    }
}

//10
//100
//20
//20
//10
//100
//10
//200