package Practice.PartOne;
//for循环结束后，该变量就从内存中小时，能够提高内存的使用效率
public class demo10Wihle {
    public static void main(String[] args){
        int x = 0;
        while (x<10)
        {
            System.out.print(x);
            x++;
        }
        System.out.println("");
        System.out.println(x+"--"); //x变成了10
        for (int y = 0; y <10; y++)
        {
            System.out.print(y);
        }
        System.out.println("");
        for (int y = 0; y < 5; y++) //变量重复使用
        {
            System.out.print(y);
        }
    }
}
