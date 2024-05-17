public class Clothing extends Product {
    protected String size;
    protected String color;
    public Clothing(){

    }
    public Clothing(String product_ID,String product_name,int available_item,double price,String size,String color){
        super(product_ID,product_name,available_item,price);
        this.size=size;
        this.color=color;
    }
    public String GetSize(){
        return size;
    }
    public void SetSize(String size){
        this.size=size;
    }
    public String GetColor(){
        return color;
    }
    public void SetColor(String color){
        this.color=color;
    }
}
