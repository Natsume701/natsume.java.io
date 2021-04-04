package Practice.PartOne;

public class demo09While {
    public static void main(String[] args){
        // 打印十遍"HelloWorld"
        for (int x = 0; x < 10; x++){
            System.out.println("HelloWorlld");
        }
        System.out.println("===================");


        int x = 0;
        while (x < 10){
            x++;
            System.out.println("HelloWorld");
        }
        System.out.println("===================");

        System.out.println("####################");

        //求和
        int sum = 0;
        for (int a = 1; a <= 100; a++){
            sum += a;
        }
        System.out.println(sum); //5050

        int summ = 0;
        int a = 1;
        while (a<=100){
            summ += a;
            a++;
        }
        System.out.println(summ); //5050


        //水仙花数
        for (int b = 100; b <= 1000; b++){
            int ge = b%10;
            int shi = b/10 % 10;
            int bai = b/100 % 10;

            if (b == ge*ge*ge + shi*shi*shi + bai*bai*bai){
                System.out.println(b);
            }
        }

        int b = 100;
        while (b<=1000){
            int ge = b%10;
            int shi = b/10 % 10;
            int bai = b/100 % 10;
            if (b == ge*ge*ge + shi*shi*shi + bai*bai*bai){
                System.out.println(b);
            }
            b++;
        }
        //153
        //370
        //371
        //407
    }
}
