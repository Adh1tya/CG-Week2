public class Patient {

    // Static variable shared among all patients
    static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // Final for unique identification

    // Constructor using 'this'
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get total patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details using instanceof
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient object.");
        }
    }

    // Main method to test Patient class
    public static void main(String[] args) {
        Patient p1 = new Patient("Meera", 30, "Flu", 1001);
        Patient p2 = new Patient("Ravi", 45, "Fracture", 1002);

        System.out.println("\n--- Patient 1 Details ---");
        p1.displayPatientDetails();

        System.out.println("\n--- Patient 2 Details ---");
        p2.displayPatientDetails();

        System.out.println();
        Patient.getTotalPatients();
    }
}



