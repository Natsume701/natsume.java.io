package Practice.duoTai.DuoTaiPractice;

class Animal{
    private String name;
    private int age;

    public Animal(){}

    public Animal(String name, int age){
        this.age = age;
        this.name = name;
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

    //三个方法
    public void show(){
        System.out.println("name:"+name+",age:"+age);
    }
    public void sleep(){
        System.out.println("sleep");
    }
    public void eat(){
        System.out.println("eat");
    }
}

class Dog extends Animal{
    public Dog(){}

    public Dog (String name, int age){
        super(name, age);
    }
    public void eat(){
        System.out.println("dog eat");
    }
    public void sleep(){
        System.out.println("Dog sleep");
    }
}

class Cat extends Animal{
    public Cat(){}

    public Cat(String name, int age){
        super(name, age);
    }
    public void eat(){
        System.out.println("Cat eat");
    }
    public void sleep(){
        System.out.println("Cat sleep");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setAge(10);
        a.setName("动物们");
        a.eat();
        a.show();
        a.sleep();
        System.out.println("================");

        Animal a2 = new Animal("动物", 20);
        a2.eat();
        a2.sleep();
        a2.show();
        System.out.println("===============");

        Dog d = new Dog("大黄", 5);
        d.eat();
        d.sleep();
        d.show();
        System.out.println("===============  ");
    }
}
//eat
//name:动物们,age:10
//sleep
//================
//eat
//sleep
//name:动物,age:20
//===============
//dog eat
//Dog sleep
//name:大黄,age:5
//===============