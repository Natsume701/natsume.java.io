package Practice.PartOne;
//输出5行*****
public class demo12 {
    public static void main(String[] args){
        // 方法一
        for (int a = 0; a < 5; a++){
            System.out.println("*****");
        }
        System.out.println("===============================");


        //方法二
        for (int a = 0; a < 5; a++){
            for (int b = 0; b < 5; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
/*
*****
*****
*****
*****
*****
===============================
*****
*****
*****
*****
*****

 */