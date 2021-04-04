package Practice.OOPPart4;
/*
权限修饰符：
                                 本类      同一个包下的子类或其他类       不同包下的类
                        不同包下其他类
               private          Y
               默认
               protected

               public
 */
public class Father {
    private void show(){
        System.out.println("show");
    }
    void show2(){
        System.out.println("show2");
    }
    protected void show3(){
        System.out.println("show3");
    }
    public void show4(){
        System.out.println("show4");
    }
    public static void main(String[] args){
        Father f = new Father();
        f.show();
        f.show2();
        f.show3();
        f.show4();
    }
}
//show
//show2
//show3
//show4