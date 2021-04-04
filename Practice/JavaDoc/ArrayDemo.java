package Practice.JavaDoc;
/*
制作一个说明书的过程：
    1。 写代码
    2。 加入文档注释
    3。 通过javadoc工具生成说明书
                格式： javadoc -d 目录 -author -version ArrayTool.java
                            javadoc -d doc -author - version ArrayTool.java
                注意： javadoc: 错误 -找不到可以文档化的公共或受保护的类
                            说明类的权限不够大，用public修饰即可

 */

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {56, 38, 91, 72, 40};


    }
}
