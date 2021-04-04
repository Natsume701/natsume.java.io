package Practice.PartOne;
/*
需求： 输出满足如下条件的五位数
个位等于万位
十位等于千位
各位+十位+千位+万位= 百位
 */
public class demo08For {
    public static void main(String[] args){
        for (int x= 10000; x<100000; x++){
            int a = x%10;
            int b = x/10%10;
            int c = x/100%10;
            int d = x/1000%10;
            int e = x/10000%10;
            if ((a == e) && (b == d) &&(a+b+d+e == c)){
                System.out.println(x);
            }
        }
    }
}
/*
10201
11411
12621
13831
20402
21612
22822
30603
31813
40804
 */