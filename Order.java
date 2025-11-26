import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<MenuItem> items;
    private double totalAmount;
    private static int counter=1;

    public Order(Customer customer){
        this.orderId=counter++;
        this.customer=customer;
        this.items=new ArrayList<>();
    }

    public void addItem(MenuItem item){
        items.add(item);
    }

    public void calculateTotal(){
        totalAmount=0;
        for(MenuItem item : items){
            totalAmount+= item.getPrice();
        }
        customer.addLoyaltyPoints(totalAmount);
        double discountPercent = customer.getDiscount();
        totalAmount-=(totalAmount*discountPercent);
    }

    public String getOrderSummary(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append(", Customer: ").append(customer.getName()).append(", Total Amount: ").append(totalAmount).append("\nItems: ");

        for(MenuItem item: items){
           sb.append(item.getName()).append(" - ");
        }
        return sb.toString();
    }

    public double getTotalAmount(){
        return totalAmount;
    }



}

