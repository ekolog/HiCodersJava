package stock;

import product.Product;

import java.util.ArrayList;

public class Stock {
    private ArrayList<Product> totalProducts;

    public Stock(ArrayList<Product> totalProducts) {
        this.totalProducts = totalProducts;
    }

    public ArrayList<Product> getTotalProducts() {
        return totalProducts;
    }

    public void setTotalProducts(ArrayList<Product> totalProducts) {
        this.totalProducts = totalProducts;
    }
}
