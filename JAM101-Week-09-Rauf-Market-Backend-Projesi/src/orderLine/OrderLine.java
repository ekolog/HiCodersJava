package orderLine;

import product.Product;

import java.text.DecimalFormat;

public class OrderLine {
    private Product product;
    private int productQuantity;
    private DecimalFormat totalItemPrice;

    public OrderLine(Product product, int productQuantity, DecimalFormat totalItemPrice) {
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

    public DecimalFormat getTotalItemPrice() {
        return totalItemPrice;
    }

    public void setTotalItemPrice(DecimalFormat totalItemPrice) {
        this.totalItemPrice = totalItemPrice;
    }
}
