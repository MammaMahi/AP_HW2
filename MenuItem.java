public abstract class MenuItem {
    private String itemId;
    private String name;
    private double price;
    private String category;
    private static int counter=1;

    public MenuItem(String name,double price,String category){
        this.itemId= String.valueOf(counter++);
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public String getItemId() {
        return itemId;
    }
    public String getName() {

        return name;
    }

    public double getPrice() {
        return price;
    }
    public String getCategory(){
        return category;
    }

    public abstract String getDetails();
}
