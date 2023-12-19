package PPJ_c20;

public class Product {
   private String name;
    private double price;
    ShoppingCart shoppingCart;

    Product(String name,double  price){
        this.name=name;
        this.price=price;
        this.shoppingCart=null;
    }


    public void addToShoppingCart(ShoppingCart shoppingCart){
        this.shoppingCart=shoppingCart;
    }
    public String toString(){
        return name + " , " + "price -> "+
                price ;

    }
}
