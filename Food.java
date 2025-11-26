public class Food extends MenuItem{
    private String spiceLevel;
    private int preparationTime;


    public Food(String name, double price, String spiceLevel, int preparationTime) {
        super(name, price, "Food");
        this.spiceLevel=spiceLevel;
        this.preparationTime=preparationTime;
    }
@Override
    public String getDetails(){
        return "ID: " + getItemId()+ ", Name: "+ getName() + ", Price: "+getPrice()+ ", Category: " + getCategory()+
                " , Spice: "+spiceLevel+ ", Preparation Time: "+preparationTime+"min";
    }
}
