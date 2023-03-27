package addressbook;

import java.util.*;
import java.util.stream.Collectors;

public class AddressBookMain {
   static Scanner scr = new Scanner(System.in);
   //public Map<String,AddressBook> addressBookListMap = new HashMap<>();
   static HashMap<String, AddressBook> map = new HashMap<>();
    static ArrayList<String> addressBooks = new ArrayList<>();
    static String currentAddressBook;
    static String addressBookName;
    public static void main(String[] args) {
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
                    map.get(currentAddressBook).addContact();
                    break;
                case 2:
                    map.get(currentAddressBook).editContact();
                    break;
                case 3:
                    map.get(currentAddressBook).displayContact();
                    break;
                case 4:
                    map.get(currentAddressBook).deleteContact();
                    break;
                case 5:
                    chooseAddressBook();
                    break;
                case 6:
                    addressBook.searchContact();
                     break;
                case 7:
                    addressBook.viewPersonByCityOrState();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                break;
            }
        }
        System.out.println(addressBooks);
    }

    static void chooseAddressBook() {
        AddressBook add = new AddressBook();
        System.out.println("""
                Press 1 to add AddressBook
                Press 2 to select AddressBook""");
        int option = scr.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter address book name");
                addressBookName = scr.next().toLowerCase();
                if (map.containsKey(addressBookName)) {
                    System.out.println("\nAddress book already exist\n");
                } else {
                    // AddressBook addressBook = new AddressBook();
                    map.put(addressBookName, add);
                    currentAddressBook = addressBookName;
                }
                addressBooks.add(addressBookName);
                break;
          /*  case 2:
                System.out.println("Enter address book name");
                addressBookName = scr.next().toLowerCase();
                if (!map.containsKey(addressBookName)) {
                    System.out.println("\nAddressBook not Found\n");
                    chooseAddressBook();
                } else
                    currentAddressBook = addressBookName;
                break;
            default:
                break;
        }

           */
        }
    }

}

