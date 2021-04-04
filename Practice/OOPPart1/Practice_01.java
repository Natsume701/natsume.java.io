package Practice.OOPPart1;

class Test{
    String id;
    String name;
    int age;

    public void prep(){
        System.out.println("学生准备大纲");
    }
    public void review(){
        System.out.println("学生复习");
    }
    public void test(){
        System.out.println("学生考试");
    }
}
public class Practice_01 {
    public static void main(String[] args) {
         Test t = new Test();
        System.out.println(t);

        System.out.println("学号是： "+t.id); //null
        System.out.println("姓名是： "+t.name);//null
        System.out.println("年龄是： "+t.age);//0
        System.out.println("--------------");

        t.id = "13875";
        t.name = "Monica";
        t.age = 17;

        System.out.println("学号是： "+t.id); //null
        System.out.println("姓名是： "+t.name);//null
        System.out.println("年龄是： "+t.age);//0
        System.out.println("--------------");

        t.prep();
        t.review();
        t.test();
    }
}
//学号是： null
//姓名是： null
//年龄是： 0
//--------------
//学号是： 13875
//姓名是： Monica
//年龄是： 17
//--------------
//学生准备大纲
//学生复习
//学生考试