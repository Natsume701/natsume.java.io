package Practice.OOPPractice;

// 定义一个长方形类， 定义求周长和面积的方法，然后定义一个测试类Test，进行测试
/*
一个基本类的标准代码写法
类
    成员变量
    构造方法:
        无参构造方法
        带参构造方法
    成员方法:
        getXxx()
        setXxx()
给成员变量赋值的方式
    无参构造方法+setXxx()
    带参构造方法
 */

class Rectangular{
    //成员变量
    private int length;
    private int width;

    //无参构造方法
    public Rectangular(){}

    //带参构造方法
    public Rectangular(int length, int width){
        this.length = length;
        this.width = width;
    }

    //set/get
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }

    //周长
    public int circumference(){
        return (length+width)*2;
    }
    //面积
    public int area(){
        return length*width;
    }

}
public class Test_Rectangular {
    public static void main(String[] args) {
        //无参
        Rectangular rec = new Rectangular();
        rec.setLength(100);
        rec.setWidth(50);
        System.out.println("周长是： "+rec.circumference());
        System.out.println("面积是： "+rec.area());

        System.out.println("=============================");
        //带参
        Rectangular rec2 = new Rectangular(100, 50);
        System.out.println("周长是： "+rec2.circumference());
        System.out.println("面积是： "+rec2.area());

    }
}
//周长是： 300
//面积是： 5000
//=============================
//周长是： 300
//面积是： 5000