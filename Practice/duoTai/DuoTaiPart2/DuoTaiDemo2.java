package Practice.duoTai.DuoTaiPart2;
/*
如何访问子类特有功能？
    A - 创建子类对象即可
    B - 多态的转型问题
            向上转型
                    从子到父
                    从父类引用指向子类对象
            向下转型
                    从父到子
                    父类引用转为子类对象

     孔子装爹案例：
            孔子： 教书（）： 讲论语， 玩游戏（）： 连连看， age：20
            孔子爹： 教书（）： JavaSE， age：40

            多态
            孔子爹 k爹 = new 孔子（）；
            //孔子代替父亲去讲课

 */

class Animall {
    public void eat(){}
}

class Dogg extends Animall{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void help(){
        System.out.println("警犬会帮助警察叔叔抓犯人");
    }
}

class Catt extends Animall{
    public void eat(){
        System.out.println("猫吃老鼠");
    }
}

public class DuoTaiDemo2 {
    public static void main(String[] args) {
        //多态
        Animall a = new Dogg(); //向上转型
        a.eat();
        //a.help(); 不可以访问， 编译看左边

        //向下转型
        Dogg d = (Dogg)a;
        d.eat();
        d.help();
        System.out.println("===========");


        a = new Catt(); //向上转型
        a.eat();

        Catt c = (Catt)a;
        c.eat();
    }
}
//狗吃骨头
//狗吃骨头
//警犬会帮助警察叔叔抓犯人
//===========
//猫吃老鼠
//猫吃老鼠
