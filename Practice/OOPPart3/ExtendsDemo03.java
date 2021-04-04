package Practice.OOPPart3;
/*
使用变量是， 先找局部范围
使用成员变量 - 加this关键字
使用父类成员变量 - 加super关键字
 */

class Father{
    public int age = 40; //父类的成员变量
}
class Son extends Father{
    public int num = 100;
    public int age = 20;

    public void show(){
        int age = 60;
        System.out.println(age); //局部age - 60
        System.out.println(this.age);// 本类成员变量 - 20
        System.out.println(super.age);//父类成员变量 - 40
        System.out.println(num); // 100
    }
}
public class ExtendsDemo03 {
    public static void main(String[] args) {
        Son a = new Son();
        a.show();//执行测试
    }
}
//60
//20
//40
//100