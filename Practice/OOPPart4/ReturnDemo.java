package Practice.OOPPart4;
//如果返回值是一个基本数据类型， 那么，返回的就是该基本类型的值
class Dem0o{
    public int sum(int a, int b){
        return a+b;
    }
}
public class ReturnDemo {
    public static void main(String[] args) {
        int x = new Dem0o().sum(10,20);
        System.out.println(x);
    }
}
