package stock;

import product.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Stock {
    private ArrayList<Product> totalProduct = new ArrayList<>();
    private final Random random = new Random();

    public Stock(){
        createAProduct();
        showProductList(totalProduct);
    }

    private LocalDate randomDate(){
        int minDay = (int) LocalDate.of(2020, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2021, 2, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        return LocalDate.ofEpochDay(randomDay);
    }

    private ArrayList<Product> createAProduct(){
        for (int index = 1;index<11;index++){
            int stockVolume = random.nextInt(10);
            double price = Math.floor(Math.random()*50);
            Product product = new Product((index)+". Product", price, randomDate(), stockVolume);
            totalProduct.add(product);
        }
        return totalProduct;
    }

    private void showProductList(ArrayList<Product> products){
        for(Product product:products){
            System.out.println(product.getProductName()
                                + " " + product.getProductPrice()
                                + " " + product.getCreateDate()
                                + " " + product.getStockVolume());
        }
    }

    public ArrayList<Product> getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(ArrayList<Product> totalProduct) {
        this.totalProduct = totalProduct;
    }
}
