package Practice.OOPPractice;
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
/*
成员变量： 编号，姓名，职位
构造方法：无参，带参
成员方法： get/set方法，show();
 */
class Employee{
    private String id;
    private String name;
    private String job;

    //无参构造方法
    public Employee(){}
    //带参构造方法
    public Employee(String id, String name, String job){
        this.id = id;
        this.name = name;
        this.job = job;
    }

    //封装 control+Fn+enter - Mac
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void show(){
        System.out.println("员工编号是："+id+"，姓名是"+name+"职位是"+job);
    }

}
public class EmployeeDemo {
    public static void main(String[] args) {
        //无参
        Employee e = new Employee();
        e.setId("itcast007");
        e.setName("Natsume");
        e.setJob("programmer");
        e.show();

        //有参
        Employee e2 = new Employee("itcast007", "Youji", "coder");
        e2.show();
    }
    //员工编号是：itcast007，姓名是Natsume职位是programmer
    //员工编号是：itcast007，姓名是Youji职位是coder
}
