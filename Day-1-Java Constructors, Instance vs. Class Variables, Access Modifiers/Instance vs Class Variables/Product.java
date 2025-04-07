class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    public Product(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: ₹" + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
