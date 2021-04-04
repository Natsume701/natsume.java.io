/*
比较两个数据是否相等。参数类型分别为两个byte类型，两个short类型，
两个int类型，两个long类型，并在main方法中进行测试
 */
package Practice.method;

public class demo02_reload {
    public static void main(String[] args){

        byte a = 11;
        byte b = 11;
        System.out.println(compare(a,b));
        System.out.println("==========");
        System.out.println(compare(9,11)); //自动使用int数据类型的方法

    }

    //byte
    public static boolean compare(byte a, byte b){
        System.out.println("byte");
        return a == b;//return true
    }
    //short
    public static boolean compare(short a, short b){
        System.out.println("short");
        return a == b;//return true
    }
    //int
    public static boolean compare(int a, int b){
        System.out.println("int");
        return a == b;//return true
    }
    //long
    public static boolean compare(long a, long b){
        System.out.println("long");
        return a == b;//return true
    }
}
