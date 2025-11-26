import com.sun.xml.internal.fastinfoset.util.StringArray;

public class Customer extends Person{
    private String customerId;
    private int loyaltyPoints;
    private static int counter=1;

    public Customer(String name, String phoneNumber) {
        super(name, phoneNumber);
       this.customerId=String.format("C%03d",counter++);
       this.loyaltyPoints=loyaltyPoints;
    }

    public void addLoyaltyPoints(double totalAmount){
        if(totalAmount>1_000_000) loyaltyPoints+=2;
        else if (totalAmount>5_00-000) loyaltyPoints+=1;
    }

    public double getDiscount(){
        if(loyaltyPoints > 5) return 0.10;
        if(loyaltyPoints > 3) return 0.05;
        return 0;
    }

    @Override
    public String getInfo() {
        return "ID: "+ customerId+ ", Name: "+ getName()+ ", Phone: " +getPhoneNumber() +
                ", Loyalty Points: "+ loyaltyPoints;
    }
}
