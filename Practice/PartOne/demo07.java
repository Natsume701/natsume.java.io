package Practice.PartOne;
//求5的阶乘
// n! = n * (n-1)*(n-2)*...*1
public class demo07 {
    public static void main(String[] args){
        //定义累乘变量
        int factorial = 1;
        for (int x = 1; x <= 5; x++){
            factorial *= x;
        }
        System.out.println("5的阶乘是： "+factorial); //5的阶乘是： 120

        //计算水仙花数
        int count = 0;
        for (int a = 100;a < 1000; a++){
            int ge = a %10;
            int shi = a/10 %10;
            int bai = a/100 %10;
            if (a == ge*ge*ge + shi*shi*shi + bai*bai*bai){
                System.out.print("水仙花数是： "+a);
                System.out.println();
                count++;
            }
        }
        System.out.println("水仙花数有： " + count + "个");
    }
}
/*
5的阶乘是： 120
水仙花数是： 153
水仙花数是： 370
水仙花数是： 371
水仙花数是： 407
水仙花数有： 4个
 */