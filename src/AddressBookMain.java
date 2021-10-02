import java.util.Scanner;

public class AddressBookMain {


    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program ");
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Delete Contact. ");
    }
    public static void createContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name: ");
        String lastName = scanner.next();
        System.out.println("Enter email: ");
        String email = scanner.next();
        System.out.println("Enter Address: ");
        String address = scanner.next();
        System.out.println("Enter Mobile Number");
        int number = scanner.nextInt();


    }
}

