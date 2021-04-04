package Practice.Array;

public class demo02 {
    public static void main(String[] args) {
        //定义一个数组并赋值
        int[] array = {11,22,33,44,55};

        //方式1
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=============");

        // 方式2  数太多了
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
