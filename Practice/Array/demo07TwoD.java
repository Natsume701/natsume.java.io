/*
/*
	公司年销售额求和
		某公司按照季度和月份统计的数据如下：单位(万元)
		第一季度：22,66,44
		第二季度：77,33,88
		第三季度：25,45,65
		第四季度：11,66,99

	分析：
		A:通过观察，我们知道，这应该用一个二维数组来表示
		B:定义求和变量
		C:遍历二维数组，获取每一个元素，然后累加即可。
		D:输出结果。

*/

package Practice.Array;

public class demo07TwoD {
    public static void main(String[] args) {
        int[][] array = {{22,66,44}, {77,33,88}, {25,45,65},{11,66,99}};

        int sum=0;

        for (int x = 0;  x <array.length ; x++) {
            for (int i = 0; i < array[x].length; i++) {
                sum += array[x][i];
            }
        }
        System.out.println("sum: "+sum);

    }
}
