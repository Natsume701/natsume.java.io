package Practice.OOPPart3;

//人类
class Person{
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int gae){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 写两个方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

//学生类
class Student extends Person{
    public Student(){}

    public Student(String name, int age){
        super(name, age);
    }
}

//老师类
class Teacher extends Person{

}
public class ExtendsDemo05 {
    public static void main(String[] args) {
        Student s = new Student(); //无参
        s.setName("卢奕含");
        s.setAge(18);
        System.out.println(s.getName()+"---"+s.getAge());
        s.eat();
        s.sleep();
        System.out.println("----------------");

        Student s2 = new Student("王哈哈", 17); // 有参
        System.out.println(s2.getName()+"---"+s.getAge());
        s2.eat();
        s2.sleep();
        System.out.println("-------------");

        Teacher t = new Teacher();
        t.setName("程乐乐");
        t.setAge(18);
        System.out.println(t.getName()+"---"+t.getAge());
        t.eat();
        t.sleep();

    }
}
//卢奕含---18
//吃饭
//睡觉
//----------------
//王哈哈---18
//吃饭
//睡觉
//-------------
//程乐乐---18
//吃饭
//睡觉