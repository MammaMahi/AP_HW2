//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Employee chef = new Employee("Maryam", "09832736294", "Chef", 12000000);
        Employee acountant = new Employee("Reza", "09212233445", "Waiter", 8000000);
        Employee waiter = new Employee("Sara", "09351122334", "Accountant", 10000000);

        chef.addHoursWorked(178);
        acountant.addHoursWorked(160);
        waiter.addHoursWorked(170);


        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ali", "09034883429"));
        customers.add(new Customer("Mahsa", "09121112222"));
        customers.add(new Customer("Reyhane", "09132223344"));
        customers.add(new Customer("Sina", "09354445566"));
        customers.add(new Customer("Amir", "09156667788"));


        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(new Food("Pizza", 400000, "Medium", 25));
        menu.add(new Food("Burger", 350000, "Mild", 15));
        menu.add(new Beverage("Tea", 60000, "Large", "Hot"));
        menu.add(new Beverage("Soda", 50000, "Medium", "Cold"));


        for (Customer c : customers) {
            Order order = new Order(c);
            order.addItem(menu.get(0));
            order.addItem(menu.get(2));
            order.addItem(menu.get(3));
            order.calculateTotal();
            System.out.println(order.getOrderSummary());
        }


        System.out.println("\nEmployee Salaries:");
        System.out.println(chef.getInfo() + " -> Salary: " + chef.calculateSalary());
        System.out.println(acountant.getInfo() + " -> Salary: " + acountant.calculateSalary());
        System.out.println(waiter.getInfo() + " -> Salary: " + waiter.calculateSalary());


        Customer best = customers.get(0);
        for (Customer c : customers) {
            if (c.getDiscount() > best.getDiscount())
                best = c;
        }

        System.out.println("\nMost Loyal Customer:");
        System.out.println(best.getInfo());


        System.out.println("\nMenu Items:");
        for (MenuItem m : menu) {
            System.out.println(m.getDetails());
        }
    }
}