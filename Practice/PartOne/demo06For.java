package Practice.PartOne;

public class demo06For {
    public static void main(String[] args){
        int i, ii = 0, a;
        for (i = 1; i <= 10; i++){
            System.out.print(i + " "); //1 2 3 4 5 6 7 8 9 10
            if (i%2 != 0){
                ii = ii + i;
            }
        }
        System.out.println("");
        //输出1-10之间偶数的和
        System.out.println(ii); // 25
        System.out.println("");
        for (a = 10; a >= 1; a--){
            System.out.print(a + " ");//10 9 8 7 6 5 4 3 2 1
        }
    }
}
