public class Beverage extends MenuItem{
    private String size;
    private String temperature;

    public Beverage(String name, double price, String size, String temperature){
        super(name,price,"Beverage");
        this.size=size;
        this.temperature=temperature;
    }

    @Override
    public String getDetails(){
        return "ID: " + getItemId()+ ", Name: "+ getName() + ", Price: "+getPrice()+ ", Category: " + getCategory()+
                ", Size: "+size+ ", Temperature: "+ temperature;
    }

}
