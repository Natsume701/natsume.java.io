package Practice.OOPPart3;
/*
学生
    具体事务 - 基础班学员， 就业班学员
    共性 - 姓名， 年龄， 班级， 学习，吃饭
 */

abstract class Student2{
    private String name;
    private int age;
    private String classId;

    public Student2 (){}
    public Student2 (String name, int age, String classId){
        this.name = name;
        this.age = age;
        this.classId = classId;
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

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void eat(){
        System.out.println("学生都要吃饭");
    }
    public abstract void study();

}

class BasicStudent extends Student2{
    public BasicStudent(){ }
    public BasicStudent(String name, int age, String classId){
        super(name, age, classId);
    }
    public void study(){
        System.out.println("基础班学员学习JavaSE");
    }
}

class JobStudent extends Student2{
    public JobStudent(){}
    public JobStudent(String name, int age, String classId){
        super(name, age, classId);
    }
    public void study(){
        System.out.println("就业班学习JavaEE+Android");
    }
}


public class StudentDemo {
    public static void main(String[] args){
        //基础班
        BasicStudent bs = new BasicStudent("嘿嘿", 22, "itcast007");
        System.out.println(bs.getName()+"---"+bs.getAge()+"---"+bs.getClassId());
        bs.eat();
        bs.study();
        System.out.println("-------------------------");

        BasicStudent bs2 = new BasicStudent("哈哈", 20, "itcast250");
        System.out.println(bs2.getName()+"---"+bs2.getAge()+"---"+bs2.getClassId());

        bs2.eat();
        bs2.study();
        System.out.println("----------------------");
    }
}
//嘿嘿---22---itcast007
//学生都要吃饭
//基础班学员学习JavaSE
//-------------------------
//哈哈---20---itcast250
//学生都要吃饭
//基础班学员学习JavaSE
//----------------------
