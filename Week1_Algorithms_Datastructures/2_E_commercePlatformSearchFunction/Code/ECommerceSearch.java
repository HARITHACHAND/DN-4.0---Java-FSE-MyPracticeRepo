package EcommercePlatformSearchFunction;

import java.util.*;

class Product {
    String name;
    String category;
    double price;

    public Product(String name, String category, double price) {
        this.name = name.toLowerCase(); // for case-insensitive search
        this.category = category.toLowerCase();
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product: %s | Category: %s | Price: ₹%.2f",
                capitalize(name), capitalize(category), price);
    }

    private String capitalize(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}

public class ECommerceSearch {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
            new Product("iphone 13", "electronics", 69999),
            new Product("samsung galaxy", "electronics", 59999),
            new Product("nike shoes", "footwear", 4999),
            new Product("dell laptop", "electronics", 55999),
            new Product("puma t-shirt", "clothing", 999)
        ));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter search term (name/category): ");
        String query = scanner.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("\n--- Search Results ---");
        for (Product product : products) {
            if (product.name.contains(query) || product.category.contains(query)) {
                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found matching your query.");
        }

        scanner.close();
    }
}
