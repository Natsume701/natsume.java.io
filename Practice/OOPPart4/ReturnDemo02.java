package Practice.OOPPart4;
//如果返回值是一个引用数据类型
/*
类： 返回的是该类的对象
抽象类： 返回的是该抽象类的子类对象
接口： 返回的是该接口的实现类对象

 */
/*
class Student{
    public void study(){
        System.out.println("好好学习，天天向上");
    }
}
class StudentDemo{
    public Student getStudent(){
        return new Student();
    }

    public int sum(int a, int b){
        return a+b;
    }
}

public class ReturnDemo02 {
    public static void main(String[] args) {
        StudentDemo sd = new StudentDemo();
        Student s = sd.getStudent();
        s.study();
    }
}

 */
abstract class Person{
    //类： 返回的是该类的对象
    //抽象类： 返回的是该抽象类的子类对象
    //接口： 返回的是该接口的实现类对象
    public abstract void study();
}

class PersonDemo{
    public Person getPerson(){
        return new Student();
    }
}
class Student extends Person{
    public void study(){
        System.out.println("好好学习，天天向上");
    }
}

public class ReturnDemo02 {
    public static void main(String[] args) {
        PersonDemo pd = new PersonDemo();
        Person p = pd.getPerson();
        p.study();
    }
}