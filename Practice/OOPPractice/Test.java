package Practice.OOPPractice;
/*
定义一个类Sum， 定义一个求两个数据的和的方法， 定义一个测试的Test，进行测试
 */

class Sum{
    private int x;
    private int y;

    //无参构造方法
    public Sum(){}

    //有参构造方法
    public Sum(int x, int y){
        this.x = x;
        this.y = y;
    }

    //封装

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int sum(){//没必要定义 参数，可以省略
        return x+y;
    }
}
public class Test {
    public static void main(String[] args) {
        Sum d = new Sum();
        d.setX(10);
        d.setY(20);
        int result = d.sum( );
        System.out.println(result); //30
    }
}
