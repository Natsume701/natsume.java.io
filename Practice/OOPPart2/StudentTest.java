package Practice.OOPPart2;
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

class Student2{
    private String name;
    private int age;
    private String gender;

    //无参构造方法
    public Student2() {}
    //有参构造方法
    public Student2(String name, int age, String gender){
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    //封装
    public void setName(String name){
        this.name = name;
    }
    public String getName(String name){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(int age){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(String gender){
        return gender;
    }

    //写一个方法
    public void show(){
        System.out.println("名字是： "+name+"， 年龄是"+age+"性别是"+gender);
    }

}
public class StudentTest {
    public static void main(String[] args) {
        //无参构造方法+setXxx
        Student2 s1 = new Student2();
        s1.setName("Natsume");
        s1.setAge(14);
        s1.setGender("男");
        System.out.println(s1.getName("")+"---"+s1.getAge(4)+"---"+s1.getGender(""));

        s1.show();
        System.out.println("---------------");


        //带参
        Student2 s2 = new Student2("Natsume", 14,"男");
        System.out.println(s2.getName("")+"---"+s2.getAge(14)+"---"+s2.getGender(""));
        s2.show();
    }
}
//---4---
//名字是： Natsume， 年龄是14性别是男
//---------------
//---14---
//名字是： Natsume， 年龄是14性别是男 