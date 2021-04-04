package Practice.PartOne;
import java.util.Scanner;
//获取三个数据中的最大值
public class demo03 {
    public static void main(String[] args){
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //键盘录入数据
        System.out.println("请输入第一个数据： ");
        int a = sc.nextInt( );
        System.out.println("请输入第二个数据： ");
        int b = sc.nextInt( );
        System.out.println("请输入第三个数据： ");
        int c = sc.nextInt( );

        //if语句实现
        if (a > b && a > c){
            System.out.println("较大的值是： "+a);
        }else if(b > a && b > c){
            System.out.println("较大的值是： "+b);
        }else if (c > a && c > b){
            System.out.println("较大的值是： "+c);
        }else{
            System.out.println("三个数字相等");
        }
    }
}
/*
请输入第一个数据：
101
请输入第二个数据：
22
请输入第三个数据：
67
较大的值是： 101

请输入第一个数据：
11
请输入第二个数据：
11
请输入第三个数据：
11
三个数字相等

 */