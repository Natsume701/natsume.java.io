/*
final关键字是最终的意思，可以修饰类，成员变量，成员方法。
1. 修饰类，类不能被继承
2. 修饰变量，变量就变成了常量，只能被赋值一次
3. 修饰方法，方法不能被重写

1:通过子类重写父类方法，来说明父类不能被人动的方法，也别动了。
为了强制不能动，Java就提高了final关键字


 */
package Practice.method;

final class Fu{
    public int num = 10;
    public final int num2 = 20;

    public final void getResource(){
        System.out.println("这是绝密的资源，可以看，不可以更改、编辑");
    }

    public void show(){
        num = 100;
        System.out.println(num);
        //num2 = 30; 不可以再一次赋值被final修饰的变量
        System.out.println(num2);
    }
}

 // 被final修饰类 - Fu，不可以被继承
/*
class Zi extends Fu{
    /*

    public void getResource(){
        System.out.println("这里想干什么就干什么");
    }


}


 */
public class FinalDemo01 {
    public static void main(String[] args) {
        //Zi z = new Zi();
    }
}
