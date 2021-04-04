package Practice.OOPPart4;

//private - 为了数据的安全性
// static - 为了让数据访问更方便

class Outerr{
    public static class Inner{ //内部类

        public void show(){
            System.out.println("show");
        }

        public static void show2(){
            System.out.println("show2");
        }
    }
}

public class InnerClassDemo02 {
    public static void main(String[] args){
        Outerr.Inner oi = new Outerr.Inner();
        oi.show();
        oi.show2();



    }
}
