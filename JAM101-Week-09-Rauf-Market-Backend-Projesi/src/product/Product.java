package product;

import java.util.Date;

public class Product {
    private String productName;
    private double productPrice;
    private Date createDate;
    private int stockVolume;

    public Product(String productName, double productPrice, Date createDate, int stockVolume) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.createDate = createDate;
        this.stockVolume = stockVolume;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getStockVolume() {
        return stockVolume;
    }

    public void setStockVolume(int stockVolume) {
        this.stockVolume = stockVolume;
    }
}
