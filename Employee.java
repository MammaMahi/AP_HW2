public class Employee extends Person{
    private String employeeId;
    private String position;
    private double salary;
    private int housrsWorked;
    private static int counter=1;

    public Employee(String name, String phoneNumber , String position,double salary) {
        super(name, phoneNumber);
        this.employeeId=String.format("E%03d",counter++);
        this.position=position;
        this.salary=salary;
    }

    public void addHoursWorked(int hours){
        this.housrsWorked+=hours;
    }

    public double calculateSalary(){
        if(housrsWorked<160)return salary;
        int hoursMore= housrsWorked-160;
        return salary+(hoursMore/160.0)*(salary*1.5);
    }

    @Override
    public String getInfo() {
        return "ID: "+ employeeId +" Name: "+getName()+ ", Phone: "+getPhoneNumber()+
                ", Position: "+position+ ", HoursWorked: "+ housrsWorked;
    }
}
