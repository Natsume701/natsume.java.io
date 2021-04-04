/*
类与类
    继承关系，只能单继承，但是可以多层继承
类与接口
    实现关系，可以单实现，也可以多实现。
    还可以在继承一个类的同时实现多个接口
接口与接口
    继承关系，可以单继承，也可以多继承

 */
package Practice.OOPPart3.Interface;
interface A{}
interface B{}
class C{}
class D extends C implements A,B{ //接口实现多层继承， 可以多实现也可以单实现
        }
interface E extends A,B{}

public class InterfaceDemo03 {
    public static void main(String[] args){

    }
}
