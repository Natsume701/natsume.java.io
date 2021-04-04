package Practice.method;

public class demo01 {
    public static void main(String[] args){
        int a;
        a = max(3,4);
        System.out.println(a);

    }

    //方法1 比大小
    public static int max(int a, int b){
        if (a>b) return a;
        else return b;
    }

    //方法2 遍历数组
    public static void printArray(int[] arr)
    {
        System.out.print("[");
        for (int x = 0; x<arr.length; x++)
        {
            if (x==arr.length-1){
                System.out.println(arr[x]);
            }else System.out.println(arr[x]+",");
        }
        System.out.println("]");

    }
}
