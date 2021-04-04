package Practice.OOPPractice;

class MyMath{
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
    public int multiply (int a, int b){
        return a*b;
    }
    public int devide (int a, int b){
        return a/b;
    }
}

public class MyMathDemo {
    public static void main(String[] args) {
        //创建对象
        MyMath my = new MyMath();

        System.out.println("加法： "+my.add(23,24));
        System.out.println("减法： "+my.subtract(23,24));
        System.out.println("乘法： "+my.multiply(23,24));
        System.out.println("除法： "+my.devide(10,4));
    }
}
//加法： 47
//减法： -1
//乘法： 552
//除法： 2