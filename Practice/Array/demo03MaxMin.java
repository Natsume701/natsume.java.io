package Practice.Array;

public class demo03MaxMin {
    public static void main(String[] args){
        int[] array = {12, 34, 54, 67, 65, 43, 4 ,67, 90, 9};

        int max=getMax(array);
        System.out.println("这个数组中最大的数是： "+max);
    }

    //写一个方法 - 获取最大值
    public static int getMax(int[] array){
        int max = array[0];

        for (int i = 1; i <array.length ; i++) {
            if (array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }
}
