package Practice.OOPPart1;
//this代表本类的对象

class Ssstudent{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name; //可以省略this
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

public class Demo_this_01 {
    public static void main(String[] args) {
        //创建对象
        Sstudent s = new Sstudent();
        //输出成员变量的值
        System.out.println(s.getName()+"---"+ s.getAge());
        //赋值
        s.setName("张国荣");
        s.setAge(28);
        //再次输出
        System.out.println(s.getName()+"---"+ s.getAge());
    }
}
