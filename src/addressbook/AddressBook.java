package addressbook;

import java.util.Scanner;

public class AddressBook {
    Contact contact = new Contact();
    Scanner scanner = new Scanner(System.in);

    void addContact(){
        System.out.println("Enter First Name");
        contact.setFirstName(scanner.next());
        System.out.println("Enter Last Name");
        contact.setLastName(scanner.next());
        System.out.println("Enter Address");
        contact.setAddress(scanner.next());
        System.out.println("Enter State");
        contact.setState(scanner.next());
        System.out.println("Enter City");
        contact.setCity(scanner.next());
        System.out.println("Enter Email");
        contact.setEmail(scanner.next());
        System.out.println("Enter Phone Number");
        contact.setPhoneNumber(scanner.nextLong());
        System.out.println("Enter Zip Code");
        contact.setZip(scanner.nextInt());
    }

    Contact display(){
        return contact;
    }
}
