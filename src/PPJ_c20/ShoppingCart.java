package PPJ_c20;

import java.util.Arrays;

public class ShoppingCart {
   private  String customerName;
    private Product [] products=new Product[10];
    private int productCount;

    ShoppingCart(String customerName){
        this.customerName=customerName;
    }
    public String getName(){
        return customerName;
    }
     public void addProduct(Product product){
         products[productCount]=product;
         ++productCount;
     }
     public void displayProducts(){
         System.out.println(Arrays.toString(products));
         System.out.println("Ilosc " + productCount );
     }
}
