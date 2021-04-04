package Practice.duoTai.Abstract01;
/*
抽象类的成员特点：
    A - 成员变量
        可以是变量
        也可以是常量
    B - 构造方法
        有构造方法，但是不能实例化
        问题： 那么，构造方法的作用是什么呢?
                用于子类访问父类数据的初始化
    C - 成员方法
        可以有抽象方法 限定子类必须完成某些动作
        也可以有非抽象方法 提高代码服用性
 */

abstract class Animall{
    int num = 10;
    final int num2=10;

    public void method(){
        System.out.println("method");
    }
    public abstract void function();
}

class Dogg extends Animall{
    public void show(){
        num=100;
        System.out.println(num);
        System.out.println(num2);
    }

    @Override
    public void function() {
    }
}

public class AbstractDemo2 {
    public static void main(String[] args) {
        Dogg d = new Dogg();
        d.show();
    }
}


//100
//10