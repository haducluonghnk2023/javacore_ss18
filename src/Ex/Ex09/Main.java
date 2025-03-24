package Ex.Ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Product> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- product management ---");
            System.out.println("1. add product");
            System.out.println("2. update product");
            System.out.println("3. delete product");
            System.out.println("4. caculate total inventory value");
            System.out.println("5. exit");
            System.out.print("select function: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addProduct(map, sc);
                    break;
                case 2:
                    updateProduct(map, sc);
                    break;
                case 3:
                    removeProduct(map, sc);
                    break;
                case 4:
                    calculateTotalValue(map);
                    break;
                case 5:
                    System.err.println("exit the program.");
                    return;
                default:
                    System.err.println("choice invalid.");
            }
        }
    }
    public static void addProduct(Map<Integer,Product> map, Scanner scanner) {
        System.out.println("enter product id ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter product name ");
        String name = scanner.nextLine();
        double price;
        while (true) {
            System.out.print("enter product price : ");
            price = scanner.nextDouble();
            if (price >= 0) {
                break;
            } else {
                System.out.println("invalid price. please enter again.");
            }
        }
        int quantity;
        while (true) {
            System.out.print("enter product quantity : ");
            quantity = scanner.nextInt();
            if (quantity >= 0) {
                break;
            } else {
                System.out.println("invalid price. please enter again.");
            }
        }
        Product product = new Product(id, name, price, quantity);
        map.put(id, product);
        System.out.println("add product successful.");
    }
    public static void updateProduct(Map<Integer,Product> map, Scanner scanner) {
        System.out.println("enter product id ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (map.containsKey(id)) {
            Product product = map.get(id);
            System.out.println("choose information need update:");
            System.out.println("1. product price");
            System.out.println("2. product quantity");
            System.out.print("choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                double price;
                while (true) {
                    System.out.print("enter new price: ");
                    price = scanner.nextDouble();
                    if (price >= 0) {
                        product.setPrice(price);
                        break;
                    } else {
                        System.out.println("price invalid. please enter again.");
                    }
                }
            } else if (choice == 2) {
                int quantity;
                while (true) {
                    System.out.print("enter new quantity: ");
                    quantity = scanner.nextInt();
                    if (quantity >= 0) {
                        product.setQuantity(quantity);
                        break;
                    } else {
                        System.out.println("quantity invalid. please enter again.");
                    }
                }
            } else {
                System.out.println("choice invalid.");
                return;
            }
            System.out.println("update product successful.");
        } else {
            System.out.println("no product found with this id.");
        }

    }
    public static void removeProduct(Map<Integer,Product> map, Scanner scanner) {
        System.out.println("enter product id need delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (map.containsKey(id)) {
            map.remove(id);
            System.out.println("delete product successful.");
        } else {
            System.out.println("no product found with this id");
        }
    }
    public static void calculateTotalValue(Map<Integer,Product> map) {
        double totalValue = 0;
        for (Product product : map.values()) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        System.out.println("total value is: " + totalValue);
    }
}
