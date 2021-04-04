/*
员工系统
    属性：
        普通员工：姓名， 工号， 工资
        经理 + 奖金
 */
package Practice.OOPPart3;

abstract class Employee{
    private String name;
    private String eid;
    private int salary;

    public Employee(){}

    public Employee(String name, String eid, int salary){
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void show(){
        System.out.println(name+"---"+eid+"---"+salary);
    }
    public abstract void work();
}

class Programmer extends Employee{
    public Programmer(){}
    public Programmer(String name, String eid, int salary){
        super(name, eid, salary);
    }
    public void work(){
        System.out.println("哈哈辛辛苦苦写代码");
    }
}

class Manager extends Employee{
    private int bonus;
    public Manager(){}

    public Manager(String name, String eid, int salary, int bonus){
        super(name, eid, salary);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }


    public void work(){
        System.out.println("经理辛辛苦苦和客户谈需求");
    }
    public void show(){
        super.show();
        System.out.println("经理额外的奖金是： "+bonus);
    }

}

public class EmployeeDemo {
    public static void main(String[] args){
        //程序员  Programmer
        Programmer p = new Programmer("谢家瑾", "10010", 7700);
        p.show();
        p.work();

        //经理
        Manager m = new Manager("王哈哈", "10086", 6000, 3000);
        m.show();
        m.work();

        Employee e = new Manager("百字义", "10000", 500, 10000);
        e.show();
        e.work();

    }
}
//谢家瑾---10010---7700
//哈哈辛辛苦苦写代码
//王哈哈---10086---6000
//经理额外的奖金是： 3000
//经理辛辛苦苦和客户谈需求
//百字义---10000---500
//经理额外的奖金是： 10000
//经理辛辛苦苦和客户谈需求
