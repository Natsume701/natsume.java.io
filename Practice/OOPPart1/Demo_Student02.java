package Practice.OOPPart1;
class Sstudent{
    private String name;
    private int age;

    //针对name给出get和set方法 - 封装
    public void setName(String n){
        //在这里也可以对name做出一些判断
        name = n;
    }
    public String getName(){
        return name;
    }
    //针对age给出get和set
    public void setAge(int a){
        age = a;
    }
    public int getAge() {
        return age;
    }


}
public class Demo_Student02 {
    public static void main(String[] args) {
        Sstudent s = new Sstudent();

        System.out.println(s.getName()+"---"+s.getAge());//null---0

        s.setName("张国荣");
        s.setAge(28);

        //再次输出
        System.out.println(s.getName()+"---"+s.getAge());//张国荣---28


        //null---0
        //张国荣---28
    }
}
