package Practice.Math;
/*
Math:做数学运算的类
特点： 没有构造方法，因为它的成员都是静态的
需求：
1。 获取随机数
public static double random():该值大于0。0 且小于1。0

2。 获取1-100之间的随机数
 */
public class MathDemo {
    public static void main(String[] args) {
        //获取随机数
        double d = Math.random();
        System.out.println(d); //0.3179143145711598
        System.out.println("=====================");



        for (int x = 0; x < 10; x++){
            System.out.println(Math.random());
            System.out.println(Math.random()*100);
            System.out.println(Math.random()*200);
        }

        System.out.println("=====================");
        //获取1-100之间的随机数
        for (int x = 10; x<100; x++){
            int number = (int)(Math.random()*100)+1;
            System.out.println(number);
        }
        System.out.println("=====================");


        int number = (int)(Math.random()*100)+1;
        System.out.println(number);
    }
}
