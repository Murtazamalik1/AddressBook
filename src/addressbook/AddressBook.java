package addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBook {
    ArrayList<Contact> list = new ArrayList<>();
    Map<Contact, String> cityDictionary = new HashMap<>();
    Map<Contact, String> stateDictionary = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "AddressBook{" +
                "list=" + list +
                ", scanner=" + scanner +
                '}';
    }

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
            } else {
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

    public void searchContact() {
        boolean exit = false;
        while (!exit) {
            System.out.println("""
                    Enter Option
                    1) To Search By City
                    2) To Search By State
                    3) Exit""");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("enter the city to search contact");
                    String city = scanner.next();
                    for (Contact contact : list) {
                        if (contact.getCity().contains(city)) {
                            System.out.println(" " + contact);
                        } else {
                            System.out.println("City Not Found In Contact");
                        }
                    }
                case 2:
                    System.out.println("enter the state to search contact");
                    String state = scanner.next();
                    for (Contact contact : list) {
                        if (contact.getState().contains(state)) {
                            System.out.println(" " + contact);
                        } else {
                            System.out.println("State Not Found In Contact");
                        }
                    }
                case 3:
                    exit = true;
                    break;
            }
        }
    }

   public void displayContact() {
        for (Contact contact : list) {
            System.out.println(contact);
        }
    }

    void viewPersonByCityOrState() {
        if (list.isEmpty()) {
            System.out.println("No contacts to display");
            return;
        }
        boolean exit = false;
        while (!exit) {
            System.out.println("""
                    Enter option
                    1) To view by City
                    2) To view by State
                    3) To exit
                    """);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the city name to view");
                    String city = scanner.next().toLowerCase();
                    for (AddressBook addressBooks : AddressBookMain.map.values()) {
                        for (Contact contacts : addressBooks.list) {
                            if (contacts.getCity().toLowerCase().contains(city)) {
                                cityDictionary.put(contacts, city);
                            }
                        }
                    }
                    System.out.println("No of contacts in city " + city + " are " + cityDictionary.size());
                    System.out.println("Contacts in city " + city + " are:");
                    System.out.println(cityDictionary.keySet());  // keySet() return a set view of All the keys present in hashmap
                    break;
                case 2:
                    System.out.println("Enter the state name to view");
                    String state = scanner.next().toLowerCase();
                    for (AddressBook addressBooks : AddressBookMain.map.values()) {
                        for (Contact contacts : addressBooks.list) {
                            if (contacts.getState().toLowerCase().contains(state)) {
                                stateDictionary.put(contacts, state);
                            }
                        }
                    }
                    System.out.println("No of contacts in state " + state + " are " + stateDictionary.size());
                    System.out.println("Contacts in state " + state + " are:");
                    System.out.println(stateDictionary.keySet());
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    break;
            }
        }
    }
}
