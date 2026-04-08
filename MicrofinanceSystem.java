import java.util.Scanner;
class Loan {
    int id;
    String name;
    double amount, interest, total;

    void addCustomer(Scanner sc) {
        System.out.print("Enter Customer ID: ");
        id = sc.nextInt();
        System.out.print("Enter Customer Name: ");
        name = sc.next();
    }

    void applyLoan(Scanner sc) {
        System.out.print("Enter Loan Amount: ");
        amount = sc.nextDouble();
        interest = amount * 0.1; // 10% interest
        total = amount + interest;
    }

    void display() {
        System.out.println("\nCustomer ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Loan Amount: " + amount);
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + total);
    }
}

public class MicrofinanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loan l = new Loan();
        int choice;

        do {
            System.out.println("\n--- MICROFINANCE SYSTEM ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Apply Loan");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    l.addCustomer(sc);
                    break;
                case 2:
                    l.applyLoan(sc);
                    break;
                case 3:
                    l.display();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while(choice != 4);

        sc.close();
    }
}