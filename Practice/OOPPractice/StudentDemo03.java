package Practice.OOPPractice;
/*
static注意事项：
1。 静态方法中没有this关键字
                因为static是随着类的加载而加载，优先于对象存在，而rhis是最这对象的创建而存在。
                先进内存的，不能访问后进内存的；但后进内存的，可以访问先进内存的
2。 静态static只能访问静态static
                非静态的成员方法：
                        可以访问静态成员变量， 非静态成员变量， 静态成员方法，非静态成员方法
                静态的成员方法：
                        只能访问静态的成员变量，静态的成员方法
 */
/*
class Student3 {
    private String name;
    public static void setName(String name){
        //this.name = name; 没有this关键字，无法使用
    }
    public void show(){
        System.out.println(name);
    }
}
*/

class Demo {
    int x = 10;
    static int y = 20;

    public void show(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void show2(){
        //System.out.println(x); //static方法只能访问static变量，但是int x没有被static修饰，不是静态变量
        System.out.println(y);
    }
    public void show3(){
        show();
        show2();
    }
    public static void show4(){
        show2();
        //show(); 无法访问非静态方法
    }
}
public class StudentDemo03 {
    public static void main(String[] args) {

    }
}
