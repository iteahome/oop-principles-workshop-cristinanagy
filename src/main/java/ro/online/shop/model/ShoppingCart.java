package ro.online.shop.model;

public class ShoppingCart {
    private int shoppingCartID;
    private int productID;
    private int quantity;

    public ShoppingCart(int shoppingCartID, int productID, int quantity) {
        this.shoppingCartID = shoppingCartID;
        this.productID = productID;
        this.quantity = quantity;
    }

    public int getShoppingCartID() {
        return shoppingCartID;
    }

    public void setShoppingCartID(int shoppingCartID) {
        this.shoppingCartID = shoppingCartID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

