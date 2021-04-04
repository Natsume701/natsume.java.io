package Practice.Array;
import java.util.Scanner;

public class demoString {
    public static void main(String[] args) {
        String[] array = {"","星期一","星期二" ,"星期三" ,"星期四" ,"星期五" ,"星期六" ,"星期日" };
        System.out.println("请输入1-7的数字： ");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        System.out.println("您输入的数字对应的是: "+array[week]);
    }
}
//请输入1-7的数字：
//2
//您输入的数字对应的是: 星期二