
import java.util.ArrayList;
import java.util.Scanner;


class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


class InventoryManagementSystem {
    private ArrayList<Product> products;

    public InventoryManagementSystem() {
        products = new ArrayList<Product>();
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(product);
        System.out.println(name +" - "+price+" Successfully added");
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Product List:");
            for (Product item : products) {
                System.out.println( item.getName() + "- Php" + item.getPrice());
            }
        }
    }
}


public class InventoryManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagementSystem run = new InventoryManagementSystem();

        System.out.println("Welcome to Janin Anne P. Silvias' Inventory Management System");

        while (true) {
            System.out.println("\n Choose Action:");
            System.out.println("(1) Add Product");
            System.out.println("(2) Display Products");
            System.out.println("(3) Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    run.addProduct(name, price);
                    break;
                case 2:
                    run.displayProducts();
                    break;
                case 3:
                    System.out.println("App Exit!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
