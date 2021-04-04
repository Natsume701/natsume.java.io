package Practice.OOPPart1;

class Student{
    String sid;
    String name;
    int age;

    public void study(){
        System.out.println("学生爱学习");
    }

    public void eat(){
        System.out.println("学生要吃饭");
    }

    public void sleep(){
        System.out.println("学生想睡觉");
    }
}


public class StudentDemo {
    public static void main(String[] args) {
        //创建"Student"对象
        Student s = new Student();

        //输出对象名
        System.out.println(s) ;

        //输出成员变量
        System.out.println("学号是： "+s.sid); //null
        System.out.println("姓名是： "+s.name);//null
        System.out.println("年龄是： "+s.age);//0
        System.out.println("--------------");

        //给成员变量赋值
        s.sid = "itcast001";
        s.name = "Natsume";
        s.age = 28;

        //再次输出成员变量
        System.out.println("学号是： "+s.sid);//itcast001
        System.out.println("姓名是： "+s.name);//Natsume
        System.out.println("年龄是： "+s.age);//28
        System.out.println("--------------");

        //使用成员方法
        s.study();
        s.eat();
        s.sleep();
    }
}
//学号是： null
//姓名是： null
//年龄是： 0
//--------------
//学号是： itcast001
//姓名是： Natsume
//年龄是： 28
//--------------
//学生爱学习
//学生要吃饭
//学生想睡觉
