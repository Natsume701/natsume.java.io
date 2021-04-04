/*
继承的好处；
1。 提高代码的复用行
2。 提高代码的维护性
3。 让类与类之间产生关系，是多态的前提

继承的弊端：
1。 类的耦合性很强
2。 低耦合，高内聚
 */
package Practice.OOPPart3;

class Studentt{
    private String name;
    private int age;

    public Studentt(){}

    public Studentt(String name, int age){
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

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }

}

class Teacherr{
    private String name;
    private int age;

    public Teacherr(){}

    public Teacherr(String name, int age){
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

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }

}

class PersonDemo {
    public static void main(String[] args) {
        Studentt s = new Studentt();
        s.setAge(28);
        s.setName("哇哈哈");
        System.out.println(s.getName()+"---"+s.getAge());
        s.eat();
        s.sleep();
        System.out.println("==============");

        Studentt s2 = new Studentt("张曼玉", 18);
        System.out.println(s2.getName()+"----"+s2.getAge());
        s2.eat();
        s2.sleep();
        System.out.println("==============");

        Teacherr t = new Teacherr();
        t.setAge(31);
        t.setName("农夫山泉");
        System.out.println(t.getName()+"---"+t.getAge());
        t.eat();
        t.sleep();
        System.out.println("==============");

        Teacherr t2 = new Teacherr("啦啦啦", 17);
        System.out.println(t.getName()+"---"+t.getAge());
        t2.eat();
        t2.sleep();
    }
}
/*
哇哈哈---28
吃饭
睡觉
==============
张曼玉----18
吃饭
睡觉
==============
农夫山泉---31
吃饭
睡觉
==============
农夫山泉---31
吃饭
睡觉

 */
