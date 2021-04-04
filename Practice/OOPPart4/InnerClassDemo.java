package Practice.OOPPart4;
/*
内部类：
       把类定义在其他类内部， 这个类就被称为内部类

      特点：
            A - 内部类可以直接访问外部类的成员， 包括私有
            B - 如果外部类访问内部类成员， 需要创建对象

      根据位置， 内部类可以分为：
            A - 成员位置
                       成员内部类
            B - 局部位置
                        局部内部类
                        访问内部的方法：
                            格式： 外部类名.内部类名 对象名 = 外部类对象.内部类对象
 */


class Outer{
    private int num = 10;

    //位置
    class Inner{ //Inner - 内部类
        public void show(){
            System.out.println(num);
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }
}

public class InnerClassDemo {
    public static void main(String[] args){
        //Inner i = new I; 内部类

        //格式： 外部类名.内部类名 对象名 = 外部类对象.内部类对象
        Outer.Inner oi =new Outer().new Inner();
        oi.show();//10

    }
}
