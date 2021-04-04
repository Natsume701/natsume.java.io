package Practice.Array;

import java.util.Scanner;

public class JiaMiDemo02 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入数据（小于八位的整数）： ");
        int number = sc.nextInt();

        jiaMi(number);

    }

    public static void jiaMi (int number){
        int[] arr = new int[8];

        //第一步
        int index=0;
        while(number>0){
            arr[index++] = number%10;
            number /= 10;
        }
        // 第二步
        for (int x=0; x<index; x++){
            arr[x] += 5;
            arr[x] %= 10;
        }

        //第三步
        int temp = arr[0];
        arr[0] = arr[index-1];
        arr[index-1] = temp;

        //输出
        for (int x=0; x<index; x++){
            System.out.println(arr[x]);
        }
        System.out.println();
    }
}
