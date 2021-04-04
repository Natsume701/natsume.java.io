package Practice.Array;

public class demo06TwoDimensional {
    public static void main(String[] args) {
        //定义一个二维数组
        int[][] array = new int[3][2];//有三个包含两个元素的一维数组
        System.out.println(array[0][1]); //没有赋值，所以是0



        int[][] array2 = {{1,2}, {2,3}, {3,4}};
        System.out.println(array2[1][1]); //第二组第二个数
        System.out.println("===========================");

        //二维数组遍历

        for (int i = 0; i < array2.length; i++) {// i<3 0 1 2
            for (int j = 0; j < array2[i].length; j++) { //j<
                System.out.print(array2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
