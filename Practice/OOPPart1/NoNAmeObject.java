package Practice.OOPPart1;

class Student2 {
    public void love(){
        System.out.println("学生喜欢放假");
    }
}

class StudentDemo2 {
    public void test(Student2 s){
        s.love();
    }
}

public class NoNAmeObject {
    public static void main(String[] args) {
        //创建对象
        Student2 s = new Student2();
        s.love();
        s.love();

        //匿名对象
        new Student2().love();
        new Student2().love();

        //有名字
        //StudentDemo2 sd = new StudentDemo2();
        //Student2 s = new Student2();

        new StudentDemo2().test(new Student2());


    }
}
