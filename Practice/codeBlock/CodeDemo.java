package Practice.codeBlock;
/*
代码块根据其位置和声明不同可以分为：
    A 局部代码块： 在方法中出现， 限定变量生命周期，及早释放， 提高内存利用率
    B 构造代码块： 在类中方法外出现：
                      多个构造方法中相同的代码存放在一起，每次调用构造都执行， 并且在构造方法前执行
    C 静态代码块： 在类中方法外出现，加了static修饰。
                      用于给类进行初始化，在加载的时候就执行，并且只执行一次
 */



/*
//局部代码块
class Code{
    public void show(){
        //局部代码块
        {
            int x = 10;
            System.out.println(x);
        }
        //System.out.println(x); 不能再局部代码块外面使用
        int y = 100;
        System.out.println(y);
    }
}
*/


/*
//构造代码块
class Code{
    //构造代码块
    {
        System.out.println("AAAAAA");
    }
    public Code(){
        System.out.println("AAAAAAAA"); //假如这个代码的内容比较多， 并且在每个构造中都会出现
    }

}
*/

//静态代码块
class Code{
    static{
        System.out.println("AAAA");
    }

}
public class CodeDemo {
}
