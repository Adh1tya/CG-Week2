class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 40.0; // Fixed daily rental rate
    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Sedan";
        this.rentalDays = 1;
    }
    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    // Calculate total cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }


    // Display method
    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("Jane Smith", "SUV", 5);
        rental1.displayRentalDetails();
    }
}
