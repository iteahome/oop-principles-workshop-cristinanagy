package ro.online.shop.model;

public class Product {

    private String productName;
    private int productID;
    private String productType;

    public Product(String productName, int productID, String productType) {
        this.productName = productName;
        this.productID = productID;
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
}
