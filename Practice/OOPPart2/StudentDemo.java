/*
构造方法： 给对象的数据进行初始化
特定：
    A. 方法名与类名相同
    B. 没有返回值类型，连void都没有
    C. 没有具体的返回值

构造方法的格式：
    修饰符 类名（···）{
    }

构造方法的注意事项：
    A. 如果你不提供构造方法， 系统会默认给出无参构造方法
    B. 如果提供，则不再提供默认无参构造方法，
                        这个时候如果还行继续使用无参构造方法，只能自己给出
                        推荐： 永远自己给出无参构造方法
    C. 构造方法也可以重载
    D. 构造方法可以有return语句吗？
                  可以， 只不过是 return;
 */

/*
一个基本类的标准代码写法
类
    成员变量
    构造方法:
        无参构造方法
        带参构造方法
    成员方法:
        getXxx()
        setXxx()
给成员变量赋值的方式
    无参构造方法+setXxx()
    带参构造方法
 */
package Practice.OOPPart2;

class Student{
    //成员变量
    private String name;
    private int age;
    private String gender;

    //构造方法
    //无参
    public Student(){//和类同名
        System.out.println("我是无参构造方法");
        //return; //可有可无
    }

    //有参
    public Student(String name){//有参构造方法
        this.name = name;
    }
    public Student(int age){
        this.age = age;
    }

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    //封装 set/get方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


    //显示所有成员变量的方法
    public void show(){
        System.out.println("名字是："+name+"，年龄是："+age);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        s.show(); //显示成员变量

        Student s2 = new Student("林青霞");
        s2.show();

        Student s3 = new Student(28);
        s3.show();

        Student s4 = new Student("林青霞", 28);
        s4.show();
    }
}
//我是无参构造方法
//名字是：null，年龄是：0
//名字是：林青霞，年龄是：0
//名字是：null，年龄是：28
//名字是：林青霞，年龄是：28