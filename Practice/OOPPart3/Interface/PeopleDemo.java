package Practice.OOPPart3.Interface;

//说英语的接口
interface SpeakEnglish{
    public abstract void speak();
}
abstract class People{
    private String name;
    private int age;
    public People(){}
    public People(String name, int age){
        this.name = name;
        this.age = age;
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

    public void sleep(){
        System.out.println("sleep");
    }
    public abstract void eat();
}

public class PeopleDemo {
}
