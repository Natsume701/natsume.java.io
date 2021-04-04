package Practice.OOPPractice;
//静态static内容是被所有对象共享的，非静态是每个对象特有的

class Student4 {
    String name;
    int age;
    static String classNumber;

    public Student4(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student4(String name, int age, String classNumber) {
        this.name = name;
        this.age = age;
        this.classNumber = classNumber;
    }

    public void show() {
        System.out.println(name + "---" + age + "---" + classNumber);
    }
}

public class StudentDemo04 {
    public static void main(String[] args) {
        Student4 s1 = new Student4("仗义", 20, "nteq8293");
        Student4 s2 = new Student4("侠义", 20);
        Student4 s3 = new Student4("浩气", 17);

        s1.show();
        s2.show();
        s3.show();

        System.out.println("======================");
        s3.name = "老挝";
        s3.classNumber = "yqck008"; //动手改，一改全改

        s1.show();
        s2.show();
        s3.show();
    }
}
//仗义---20---nteq8293
//侠义---20---nteq8293
//浩气---17---nteq8293
//======================
//仗义---20---yqck008
//侠义--- 20---yqck008
//老挝---17---yqck008