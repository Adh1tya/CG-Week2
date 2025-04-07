package Inheritance;
class Person{
    protected String name;
    protected int id;
    Person(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
interface Worker{
    void performDuties();
}
class Chef extends Person implements Worker{
    private String speciality;
    public Chef(String name, int id, String speciality){
        super(name, id);
        this.speciality = speciality;
    }
    @Override
    public void performDuties(){
        System.out.println(name + " (Chef) is cooking " + speciality + " dishes");
    }
}
class Waiter extends Person implements Worker {
    private int tablesAssigned;


    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }


    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving " + tablesAssigned + " tables.");
    }
}
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Bhaskar", 01, "Chicken Tikka Masala");
        Waiter waiter1 = new Waiter("Suresh", 02, 2);
        chef1.displayInfo();
        chef1.performDuties();
        System.out.println();
        waiter1.displayInfo();
        waiter1.performDuties();
    }
}
