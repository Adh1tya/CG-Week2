 public class Employee {

    // Static variable shared across all employees
    static String companyName = "RAVEN Pvt Ltd";
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final int id; // Final to prevent reassignment
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details using instanceof
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }

    // Main method for demonstration
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 1001, "Software Engineer");
        Employee emp2 = new Employee("Bob", 1002, "Product Manager");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();

        System.out.println();
        Employee.displayTotalEmployees();
    }
}