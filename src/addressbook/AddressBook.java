package addressbook;

import java.util.Scanner;
public class AddressBook {
    Contact[] contactArray = new Contact[2];
    Scanner scanner = new Scanner(System.in);
    void addContact() {
        for (int i = 0; i < contactArray.length; i++) {
            Contact contact = new Contact();
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
            contactArray[i] = contact;
        }
    }
    void editContact(){
        for (Contact contact : contactArray) {
            System.out.println("What You Want To Edit : \n1) FirstName\n2) LastName\n3) Address\n4) State\n5) Email\n6) PhoneNumber");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter First Name That You Want To Edit");
                    String firstName = scanner.next();
                    if (firstName.equals(contact.getFirstName())) {
                        System.out.println("Edit The Details Of Person");
                        System.out.println("Enter First Name");
                        contact.setFirstName(scanner.next());
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 2:
                    System.out.println("Enter The Last Name That You Want To Edit");
                    String lastName = scanner.next();
                    if (lastName.equals(contact.getLastName())) {
                        System.out.println("Edit The Detail Of Person");
                        System.out.println("Enter Last Name");
                        contact.setLastName(scanner.next());
                    }
                    else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 3:
                    System.out.println("Enter The Address That You Want To Edit");
                    String address = scanner.next();
                    if (address.equals(contact.getAddress())) {
                        System.out.println("Edit The Detail Of Person");
                        System.out.println("Enter The Address");
                        contact.setAddress(scanner.next());
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 4:
                    System.out.println("Enter The State That You Want To Edit");
                    String state = scanner.next();
                    if (state.equals(contact.getState())) {
                        System.out.println("Edit The Detail Of Person");
                        System.out.println("Enter State");
                        contact.setState(scanner.next());
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 5:
                    System.out.println("Enter Email That You Want To Edit");
                    String email = scanner.next();
                    if (email.equals(contact.getEmail())) {
                        System.out.println("Edit The Detail Of Person");
                        System.out.println("Enter The Email");
                        contact.setEmail(scanner.next());
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 6:
                    System.out.println("Enter The Phone Number That You Want To Edit");
                    String phoneNo = scanner.next();
                    if (phoneNo.equals(contact.getPhoneNumber())) {
                        System.out.println("Edit The Detail Of Person");
                        System.out.println("Enter The Phone Number");
                        contact.setPhoneNumber(scanner.nextLong());
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }
    void deleteContact() {
        for (Contact contact : contactArray) {
            System.out.println(" What You Want To Delete :\n1) FirstName\n2) lastName\n3) Address\n4) State\n5) Email\n6) PhoneNumber");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter First Name That You Want To Delete ");
                    String firstName = scanner.next();
                    if (firstName.equals(contact.getFirstName())) {
                        contact.setFirstName(null);
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 2:
                    System.out.println("Enter Last Name That You Want To Delete");
                    String lastNme = scanner.next();
                    if (lastNme.equals(contact.getLastName())) {
                        contact.setLastName(null);
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 3:
                    System.out.println("Enter Address That You Want To Delete");
                    String address = scanner.next();
                    if (address.equals(contact.getAddress())) {
                        contact.setAddress(null);
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 4:
                    System.out.println("Enter State That You Want To Delete");
                    String state = scanner.next();
                    if (state.equals(contact.getState())) {
                        contact.setState(null);
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 5:
                    System.out.println("Enter Email That You Want To Delete");
                    String email = scanner.next();
                    if (email.equals(contact.getEmail())) {
                        contact.setEmail(null);
                    }else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                case 6:
                    System.out.println("Enter Phone Number That You Want To Delete");
                    String phoneNumber = scanner.next();
                    if (phoneNumber.equals(contact.getPhoneNumber())) {
                        contact.setPhoneNumber(null);
                    }
                    else {
                        System.out.println("Contact Not Found");
                    }
                    break;
                default:
                    System.out.println("Contact Not Found :");
            }
        }
    }
    public void displayContact(){
        for (int i = 0; i < contactArray.length; i++) {
            System.out.println(contactArray[i].toString());
        }
    }
}
