package Practice.PartOne;
import java.util.Scanner;
// 月份 - 季节 转换 - switch + if
public class demo04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入月份： ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 2){
            System.out.println("冬季");
        }else if (month >= 3 && month <= 5){
            System.out.println("春季");
        }else if (month >= 6 && month <= 8){
            System.out.println("夏季");
        }else if (month >= 9 && month <= 11){
            System.out.println("秋季");
        }else if (month < 1 || month > 12){
            System.out.println("输入有误");
        }else{
            System.out.println("冬季");
        }
    }
}
/*
请输入月份：
8
夏季
 */
