/*
成员变量
    只能是常量
    默认修饰符 public static final
构造方法
    没有，因为接口主要是扩展功能的，而没有具体存在
成员方法
    只能是抽象方法
    默认修饰符 public abstract
 */
package Practice.OOPPart3.Interface;
interface Animal{
    public static final int num = 10;
    public abstract void show();
}
class Dog implements Animal{
    public void show() {}
}

public class InterfaceDemo02 {
    public static void main(String[] args){
        Dog d = new Dog();
        d.show();
    }
}
