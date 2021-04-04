package Practice.OOPPart1;

class Student1 {
    public void study(){
        System.out.println("学生爱学习");
    }
}

class StudentDemo1 {
    public void test(Student1 s){
        s.study();
    }
}

public class StudentTEst {
    public static void main(String[] args) {
        //如何调用？
        StudentDemo1 sd = new StudentDemo1();
        Student1 s = new Student1();
        sd.test(s);

    }
}
