import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Customer> customers = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Customer Relationship Management");
            System.out.println("1. Add new customer");
            System.out.println("2. Find by name");
            System.out.println("3. Display all");
            System.out.println("4. Exit.");
            System.out.print("Input choice: ");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Input name: ");
                    scanner.nextLine(); // Consume newline character
                    String name = scanner.nextLine();
                    System.out.print("Input email: ");
                    String email = scanner.nextLine();
                    System.out.print("Input phone: ");
                    String phone = scanner.nextLine();
                    Customer customer = new Customer(name, email, phone);
                    customers.put(name, customer);
                    System.out.println("Success!");
                    break;

                case 2:
                    System.out.print("Input name to search: ");
                    scanner.nextLine(); // Consume newline character
                    String searchName = scanner.nextLine();
                    Customer foundName = customers.get(searchName);
                    if (foundName != null) {
                        System.out.println("Name: " + foundName.getName());
                        System.out.println("Email: " + foundName.getEmail());
                        System.out.println("Phone: " + foundName.getPhoneNumber());
                    } else {
                        System.out.println("Customer not found.");
                    }
                    break;

                case 3:
                    System.out.println("Customer List : ");
                    for (Customer c : customers.values()) {
                        System.out.println("Name: " + c.getName());
                        System.out.println("Email: " + c.getEmail());
                        System.out.println("Phone: " + c.getPhoneNumber());
                        System.out.println("----------------------");
                    }
                    break;

                case 4:
                    System.out.println("Exit.");
                    System.exit(0);

                default:
                    System.out.println("Choose the right choice.");
            }
        }
    }
}