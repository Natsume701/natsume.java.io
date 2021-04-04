package Practice.Array;

public class demo01 {
    public static void main(String[] args){
        int[] array = new int[3];// 0 - 2 预留了保存三个数字的空间

        //赋值，若没有赋值，int默认为0， string默认为Null
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        //输出 数组下标越界异常
        System.out.println(array[2]);
        //System.out.println(array[4]); // ArrayIndexOutOfBoundsException

        int[] arr = {1,2,3};
        System.out.println(arr[2]);


        //空指针异常
        int[] arr2 = {1,2,3,4,5,6};
        arr2 = null;// 把arr2执行堆内内存去掉了，arr没有指向了
       // System.out.println(arr2[3]); // NullPointerException
    }
}