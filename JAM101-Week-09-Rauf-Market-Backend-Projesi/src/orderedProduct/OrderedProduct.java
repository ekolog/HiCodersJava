package orderedProduct;

import orderLine.OrderLine;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class OrderedProduct {
    private ArrayList<OrderLine> orderLines;
    private DecimalFormat totalPrice;

    public OrderedProduct(ArrayList<OrderLine> orderLines, DecimalFormat totalPrice) {
        this.orderLines = orderLines;
        this.totalPrice = totalPrice;
    }

    public ArrayList<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(ArrayList<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public DecimalFormat getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(DecimalFormat totalPrice) {
        this.totalPrice = totalPrice;
    }
}
