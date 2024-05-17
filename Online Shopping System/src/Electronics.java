public class Electronics extends Product {
    protected String brand;
    protected int warranty_period;
    public Electronics(){

    }
    public Electronics(String product_ID,String product_name,int available_item,double price,String brand,int warranty_period){
        super(product_ID,product_name,available_item,price);
        this.brand=brand;
        this.warranty_period=warranty_period;
    }
    public String Getbrand(){
        return brand;
    }
    public void Setbrand(String brand){
        this.brand=brand;
    }
    public int GetWarranty_period(){
        return warranty_period;
    }
    public void Setwarranty_period(int warranty_period){
        this.warranty_period=warranty_period;
    }
}
