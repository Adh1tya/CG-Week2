public class Vehicle {

    // Static variable shared by all vehicles
    static double registrationFee = 5000.0;

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee updated to ₹" + registrationFee);
    }

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Final to ensure uniqueness

    // Constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Method to display registration details using instanceof
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: ₹" + registrationFee);
        } else {
            System.out.println("Invalid Vehicle object.");
        }
    }

    // Main method to test Vehicle class
    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(5500.0); // Update static fee

        Vehicle v1 = new Vehicle("Arjun", "Car", "TN01AB1234");
        Vehicle v2 = new Vehicle("Divya", "Bike", "TN02CD5678");

        System.out.println("\n--- Vehicle 1 Details ---");
        v1.displayRegistrationDetails();

        System.out.println("\n--- Vehicle 2 Details ---");
        v2.displayRegistrationDetails();
    }
}

