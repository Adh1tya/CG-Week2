 public class Student {

    // Static variable shared by all students
    static String universityName = "SRM University";
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private final int rollNumber; // Final to ensure immutability
    private String grade;

    // Constructor using 'this' to resolve ambiguity
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details using instanceof
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    // Method to update grade safely
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + grade);
        } else {
            System.out.println("Cannot update grade. Invalid object.");
        }
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        Student s1 = new Student("Anjali", 101, "A");
        Student s2 = new Student("Rahul", 102, "B");

        System.out.println("\n--- Student 1 ---");
        s1.displayStudentDetails();

        System.out.println("\n--- Student 2 ---");
        s2.displayStudentDetails();

        System.out.println();
        Student.displayTotalStudents();

        System.out.println("\nUpdating Student 1's grade...");
        s1.updateGrade("A+");

        System.out.println("\n--- Updated Student 1 ---");
        s1.displayStudentDetails();
    }
}

