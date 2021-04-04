package Practice.OOPPart1;

//private - 被private修饰的成员只在本类中才能访问

class student {
    String name;
    private int age;
    public void checkAge(int a){
        if (a<0 || a>100){
            System.out.println("年龄有误");
        }else{
            age = a;
        }
    }
    public int getAge(){
        return age;
    }
}

public class Demo_Student {
    public static void main(String[] args){
        //创建学生对象
        student s = new student();

        //给name和age赋值
        s.name = "张国荣";
        //s.age = 28; age被private修饰，只能在原来的类使用

        //通过方法赋值
        s.checkAge(-28);

        //输出
        System.out.println(s.name);;
        System.out.println(s.getAge());;
        //年龄有误
        //张国荣
        //0
    }

}
