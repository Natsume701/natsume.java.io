/*
final的初始化时机
A - 在定义的时候立即给赋值， 以后再也不能改了
B - 定义后， 构造方法结束前赋值都可以
 */
package Practice.method;

/*
class Demo{
    int num;
    static final int num2 = 0;

    static {
        num2 = 10;
    }

    public Demo(){
        //num2=100;
    }
}


public class FinalDemo03 {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.num);
        System.out.println(d.num2);
    }
}


 */