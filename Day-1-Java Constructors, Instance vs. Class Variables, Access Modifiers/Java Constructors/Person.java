class Person {
    private String name;
    private int age;
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    // Display method
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person(person1); // Using copy constructor
        person1.displayPerson();
        System.out.println();
        person2.displayPerson();
    }
}
