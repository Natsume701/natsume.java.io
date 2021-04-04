package Practice.OOPPractice.Static;
//static关键字
class Student{
    String name;
    int age;
    static String classNumber;//因为编辑编号应该是被班级的每个人都共享的，定义一个OK

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Student(String name, int age, String classNumber){
        this.age = age;
        this.name = name;
        this.classNumber = classNumber;
    }
    public void show(){
        System.out.println(name+"---"+age+"---"+classNumber);
    }
}
public class StudentDemo01 {
    public static void main(String[] args) {
        Student s1 = new Student("王霸总",18, "2021071");
        s1.show();

        Student s2 = new Student("林小二", 20, "2021071");
        s2.show();

        Student s3 = new Student("孙小姐", 19);
        s3.show();

        Student s4 = new Student("张大哥", 21);
        s4.show();
    }
}
//王霸总---18---2021071
//林小二---20---2021071
//孙小姐---19---2021071
//张大哥---21---2021071