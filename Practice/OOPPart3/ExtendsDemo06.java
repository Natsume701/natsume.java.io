package Practice.OOPPart3;

class Fuu{
    public void show(){
        System.out.println("show fuu");
    }
}

class Zii extends Fuu{
    public void method(){
        System.out.println("method zii");
    }
    public void show(){
        System.out.println("show zii");
    }
}

public class ExtendsDemo06 {
    public static void main(String[] args) {
        Zii z = new Zii();
        z.show();
        z.method();
    }
}
