import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> productList;

    private int numofproduct;
    public ShoppingCart(int numofproduct){
        this.numofproduct = numofproduct;
        productList = new ArrayList<Product>();
    }
    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }
    public double calculateTotalCost() {
        return productList.stream().mapToDouble(Product::etPrice).sum();
    }

}
