public abstract class Product {
    protected String product_ID;
    protected String product_name;
    protected int available_items;
    protected double price;

    public Product(){

    }
    public Product(String product_ID,String product_name,int available_items,double price){
        this.product_ID=product_ID;
        this.product_name=product_name;
        this.available_items=available_items;
        this.price=price;
    }
    public String GetProduct_ID(){
        return product_ID;
    }
    public void SetProduct_ID(String product_ID){
        this.product_ID=product_ID;
    }
    public String GetProduct_Name() {
        return product_name;
    }
    public void SetProduct_Name(String product_name){
        this.product_name=product_name;
    }
    public int GetAvailable_Item(){
        return available_items;
    }
    public void SetAvailable_Item(int available_items){
        this.available_items=available_items;
    }
    public double GetPrice(){
        return price;
    }
    public void SetPrice(double price){
        this.price=price;
    }
}
