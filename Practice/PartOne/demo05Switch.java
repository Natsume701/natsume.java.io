package Practice.PartOne;
import java.util.Scanner;
// 月份 - 季节 转换 - switch + if
public class demo05Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入月份： ");
        int month = sc.nextInt();

        switch (month){
            case 1: System.out.println("冬季");break;
            case 2: System.out.println("冬季");break;
            case 3: System.out.println("春季");break;
            case 4: System.out.println("春季");break;
            case 5: System.out.println("春季");break;
            case 6: System.out.println("夏季");break;
            case 7: System.out.println("夏季");break;
            case 8: System.out.println("夏季");break;
            case 9: System.out.println("秋季");break;
            case 10: System.out.println("秋季");break;
            case 11: System.out.println("秋季");break;
            case 12: System.out.println("冬季");break;
        }
    }
}
/*
请输入月份：
9
秋季
 */