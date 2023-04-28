package day1;

public class phone {
    private String bran;
    private int price;
    private String color;
    public phone(){}
    public phone(String bran,int price,String color){
        this.bran=bran;
        this.price=price;
        this.color=color;
    }
    public void setBran(String bran){
        this.bran=bran;
    }
    public String getBran(){
        return bran;
    }
    public void setPrice(int price){
       this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
}
