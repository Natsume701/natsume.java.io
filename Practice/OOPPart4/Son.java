package Practice.OOPPart4;

public class Son extends Father {
    public static void main(String[] args) {
        Father f = new Father();
        //f.show(); 是priva te， 无法在别的类中使用
        f.show2();
        f.show3();
        f.show4();

        Son s = new Son();
        s.show2();
        s.show3();
        s.show4();


    }
}
