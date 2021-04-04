/*
1:杨辉三角形
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

分析：
	A:如果是n行，那么最后一行是n列。
	B:每一行的第一列和最后一列的元素是1。
	C:规律：
		每一行的第二列开始数据是：上一行的上一列+上一行的同一列
	D:把二维数组组成，然后遍历即可。
		遍历的时候，注意模仿九九乘法表的遍历。否则会有很多0。

		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你准备打印的是一个多少行的杨辉三角：");
		int n = sc.nextInt();

		int[][] arr = new int[n][n];

		for(int x=0; x<n; x++) {
			arr[x][0] = 1;
			arr[x][x] = 1;
		}

		//第三行开始
		for(int x=2; x<n; x++) {
			//第二列开始,一定要记得减去最后一列
			for(int y=1; y<=x-1; y++) {
				arr[x][y] = arr[x-1][y-1]+arr[x-1][y];
			}
		}

		System.out.println("-----------------------");
		//输出的时候，千万要和九九乘法表的输出类似。
		for(int x=0; x<arr.length; x++) {
			for(int y=0; y<=x; y++) {
				System.out.print(arr[x][y]+"\t");
			}
			System.out.println();
		}

 */
package Practice.Array;

public class demo08 {
}
