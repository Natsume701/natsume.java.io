package Practice.OOPPart1;

class Phone{
    private String brand;
    private int price;
    private String color;

    public Phone(){}

    public Phone(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //封装brand
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    //封装price
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    //封装color
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    //封装后，写一个方法
    public void show(){
        System.out.println("我的手机是："+brand+",价格是"+price+",颜色是："+color);
    }
}
public class PhoneTest {
    public static void main(String [] args){
        //无参+setXxx()
        Phone p = new Phone(); //new对象
        p.setBrand("三星");
        p.setPrice(1000);
        p.setColor("黑色");

        //有参
        Phone pp = new Phone("华为", 799, "白色");
        pp.show();
    }
}
//我的手机是：华为,价格是799,颜色是：白色