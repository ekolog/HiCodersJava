package orderLine;

import product.Product;

public class OrderLine {
    private Product product;
    private int productQuantity;
    private double totalItemPrice;

    public OrderLine(Product product, int productQuantity, double totalItemPrice) {
        this.product = product;
        this.productQuantity = productQuantity;
        this.totalItemPrice = totalItemPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public double getTotalItemPrice() {
        return totalItemPrice;
    }

    public void setTotalItemPrice(double totalItemPrice) {
        this.totalItemPrice = totalItemPrice;
    }
}
