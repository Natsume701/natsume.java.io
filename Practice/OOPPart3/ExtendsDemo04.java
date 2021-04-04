package Practice.OOPPart3;
/*继承的构造方法关系：
无参构造：
子类中所有的构造方法默认都会访问父类中空参数的构造方法， 因为
子类会继承和使用父类的数据
所以，子类初始化以前，一定要先完成父类数据的初始化

有参构造：
如何访问父类的带参构造方法：
通过super()

注意事项：
A - 每一个构造方法的第一条语句默认都是 super（）
B - super（） 这样的形式在构造方法中只能出现一次
C - 如果父类没有无参构造方法， 那么， 只能
        a - 通过super访问父类的带参构造方法
        b - 通过this访问本类的其他构造方法
 */


class fu{
    public fu (String name){ // 父类的有参构造方法
        System.out.println("hello");
    }
}
/*
class Zi extends fu{
    public Zi(){

        System.out.println("zi()");
    }

    public Zi(String name){
        System.out.println("world");
    }
}
*/
public class ExtendsDemo04 {
    public static void main(String[] args) {
        Zi z = new Zi();
        System.out.println("==============");
        Zi z2 = new Zi();
    }
}
