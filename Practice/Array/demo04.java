/*
数组元素对调
第一个和最后一个交换
第二个和倒数第二个交换
 */
package Practice.Array;

public class demo04 {
    public static void main(String[] args){
        //定义数组
        int[] array = {12,88,76,66,86};

        printArray(array);

        reverse(array); //进行对调Reverse方法后
        printArray(array); //再调用遍历printArray方法


    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void reverse(int[] array){
        for (int start = 0, end = array.length-1; start<=end; start++, end--){
            int temp = array[start];
            array[start] = array[end]; //对调
            array[end] = temp; //对调
        }
    }
}
