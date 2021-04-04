package Practice.method;
import java.util.Scanner;

public class demoReloadTwo {
    public static void main(String[] args){
        System.out.println(sum(100,123));

        System.out.println("请输入三个整数: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println(sum(x,y,z));
        //请输入三个整数:
        //55 66 77
        //198

    }

    //两个数的和
    public static int sum(int a, int b){
        return a+b;
    }
    //三个数的和
    public static int sum(int a, int b, int c)
    {
        return a+b+c;
    }

}
