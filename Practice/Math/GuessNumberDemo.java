package Practice.Math;
/*
猜数字小游戏
系统产生1-100之间的随机数
    1. int number = (int)(Math.random()*100)+1;
    2. 键盘录入数据， 用Scanner实现
    3. 用这两个数据进行比较
    4. 加入循环，为了能够猜中
 */
import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;
public class GuessNumberDemo {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100)+1;

        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数据（1-100）： ");
            int guessNumber = sc.nextInt();

            if (guessNumber > number){
                System.out.println("你猜的数"+guessNumber+"大了");
            }
            if (guessNumber < number){
                System.out.println("你猜的数"+guessNumber+"小了");
            }if (guessNumber == number){
                System.out.println("恭喜你，猜中了！");break;
            }else{
                System.out.println("输入错误");

            }
        }
    }
}
//请输入一个数据（1-100）：
//99
//你猜的数99大了
//输入错误
//请输入一个数据（1-100）：
//77
//你猜的数77小了
//输入错误
//请输入一个数据（1-100）：
//88
//你猜的数88小了
//输入错误
//请输入一个数据（1-100）：
//90
//你猜的数90小了
//输入错误
//请输入一个数据（1-100）：
//92
//你猜的数92小了
//输入错误
//请输入一个数据（1-100）：
//94
//你猜的数94小了
//输入错误
//请输入一个数据（1-100）：
//96
//恭喜你，猜中了！