package orderedProduct;

import orderLine.OrderLine;

import java.util.ArrayList;

public class OrderedProduct {
    private ArrayList<OrderLine> orderLines;
    private double totalPrice;

    public OrderedProduct(ArrayList<OrderLine> orderLines, double totalPrice) {
        this.orderLines = orderLines;
        this.totalPrice = totalPrice;
    }

    public ArrayList<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(ArrayList<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
