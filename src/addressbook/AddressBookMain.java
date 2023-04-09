package addressbook;

import java.util.*;
public class AddressBookMain {
    public static void main(String[] args) {
        AddressBookMain mainBook = new AddressBookMain();
        Scanner scr = new Scanner(System.in);
        HashMap<String, AddressBook> map = new HashMap<>();
        AddressBook addressBook = new AddressBook();
        System.out.println("Welcome to Address Book Program");
        boolean exit = false;
        while (!exit) {
            System.out.println("""
                    \nEnter options:
                    1) To add contact
                    2) To edit Contact
                    3) To display Contacts
                    4) To delete contact
                    5) To add address book or select addressBook
                    6) To search contact
                    7) view person by City or State
                    8) To exit
                    """);
            int option = scr.nextInt();
            switch (option) {
                case 1:
                    map.get(addressBook).addContact(map);
                    break;
                case 2:
                    map.get(addressBook).editContact(map);
                    break;
                case 3:
                    map.get(addressBook).displayContact(map);
                    break;
                case 4:
                    map.get(addressBook).deleteContact(map);
                    break;
                case 5:
                case 6:
                    addressBook.searchContact(map);
                    break;
                case 7:
                    addressBook.viewPersonByCityOrState(map);
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    break;
            }
        }
        System.out.println(addressBook);
    }
}
