package onlineSale;

import orderLine.OrderLine;
import orderedProduct.OrderedProduct;
import product.Product;
import stock.Stock;

import java.util.ArrayList;
import java.util.Random;

public class OnlineSale {
    private final Stock stock = new Stock();
    private final ArrayList<Product> products = stock.getTotalProduct();
    private final ArrayList<OrderLine> orderLines = new ArrayList<>();
    private final OrderedProduct orderedProduct = orderedProduct(orderLines);
    private OrderLine orderLine;
    private final Random random = new Random();

    public OnlineSale(){
        buyProduct();
        showOrderLines();
        showLastStock();
    }

    private void buyProduct(){
        for (int index = 0;index<randomOfHowManyTimesPurchase();index++) {
            int productIndex = randomSequenceNumber();
            Product product = products.get(productIndex);
            int productRequest = randomOfProductPurchases();

            if (checkStock(product.getStockVolume(), productRequest)) {
                OrderLine orderLine = createOrderLine(productIndex, productRequest);
                orderLines.add(orderLine);
                int newVolume = calculateNewVolume(product.getStockVolume(), productRequest);
                updateStockVolume(productIndex, newVolume);
            } else {
                System.out.println("There is not enough product in stock!!!"
                        + "There are " + product.getStockVolume()
                        + " items in stock" + " " + product.getProductName()
                        + " but requested items are " + " " + productRequest);
            }
        }
    }

    private OrderedProduct orderedProduct(ArrayList<OrderLine> orderLines){
        double total = 0;
        for (OrderLine orderLine:orderLines){
            System.out.println("orderline.getTotalItemPrice => " + orderLine.getTotalItemPrice());
            total += orderLine.getTotalItemPrice();
            System.out.println("orderline.getTotalItemPrice => " + total);
        }
        return new OrderedProduct(orderLines, total);
    }

    private int randomSequenceNumber(){
        return random.nextInt(10);
    }

    private int randomOfProductPurchases(){
        return random.nextInt(10)+1;
    }

    private boolean checkStock(int stock, int productRequest){
        return stock != 0 & stock >= productRequest;
    }

    private int randomOfHowManyTimesPurchase(){
        return random.nextInt(10);
    }

    private int calculateNewVolume(int oldVolume, int requestedVolume){
        return oldVolume - requestedVolume;
    }

    private void updateStockVolume(int index,int newVolume){
        products.get(index).setStockVolume(newVolume);
    }

    private OrderLine createOrderLine(int productIndex, int productRequest){
        double totalPrice = productRequest * products.get(productIndex).getProductPrice();
        return new OrderLine(products.get(productIndex), productRequest, totalPrice);
    }

    private void showLastStock(){
        System.out.println("----------Yeni Stock----------");
        for(Product product:products){
            System.out.println("Product name : "+product.getProductName()
                    + " Product Price: " + product.getProductPrice()
                    + " Stock Volume:"+ product.getStockVolume()
                    + " Create Date: "+ product.getCreateDate()
            );
        }
    }

    private void showOrderLines(){
        System.out.println("----------OrderLines----------");
        if (orderLines.size()!=0) {
            for (OrderLine orderLine : orderLines) {
                System.out.println(orderLine.getProduct().getProductName()
                        + " " + orderLine.getProduct().getCreateDate()
                        + " " + orderLine.getProduct().getProductPrice()
                        + " " + orderLine.getProductQuantity());
            }
            System.out.println(orderLines.size() + " kadar farkli ürün alinmistir ve bunlarin toplam fiyati " + orderedProduct.getTotalPrice() + "CHF dir.");
        }else{
            System.out.println("OrderLine da bir ürün yok");
        }
    }
}
