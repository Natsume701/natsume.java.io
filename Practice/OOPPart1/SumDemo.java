package Practice.OOPPart1;

class Demo{
    public int sum(int a, int b){
        return a+b;
    }
}

public class SumDemo {
    public static void main(String[] args) {
        //定义变量
        int a = 10;
        int b = 20;

        //创建对象
        Demo d = new Demo();
        int result = d.sum(a,b);

        System.out.println("结果是： "+result); //结果是： 30
    }
}
