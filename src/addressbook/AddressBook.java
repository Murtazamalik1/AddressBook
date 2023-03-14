package addressbook;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {

    ArrayList<Contact> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void addContact() {
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
            list.add(contact);
    }
    public void editContact() {
        System.out.println("Enter The Person Name That You Want To edit ");
        String firstName = scanner.next();
        for (Contact contact : list) {
            if (firstName.equals(contact.getFirstName())) {
                System.out.println("What You Want To Edit : \n1) FirstName\n2) LastName\n3) Address\n4) State\n5) Email\n6) PhoneNumber");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("Edit The Details Of Person");
                        System.out.println("Enter First Name");
                        contact.setFirstName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Edit The Detail Of Person");
                        System.out.println("Enter Last Name");
                        contact.setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter The Address");
                        contact.setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter State");
                        contact.setState(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter The Email");
                        contact.setEmail(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter The Phone Number");
                        contact.setPhoneNumber(scanner.nextLong());
                        break;
                    default:
                        System.out.println("Wrong Input");
                }
            }
              else {
                System.out.println("contact not found");
            }
        }
    }

    void deleteContact() {
        System.out.println("Enter Person Name That You Want To Edit");
        String firstName = scanner.next();
        for (int i = 0; i < list.size(); i++) {
            Contact person = list.get(i);
            if (firstName.equals(person.getFirstName())) {
              list.remove(i);
                System.out.println("Contact Removed");
            } else {
                System.out.println("contact not found");
            }
        }
    }
        public void displayContact () {
            for (Contact contact : list) {
                System.out.println(contact);
            }
        }
    }
