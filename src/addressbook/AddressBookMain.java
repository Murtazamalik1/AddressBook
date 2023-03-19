package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book System");
        HashMap<String, AddressBook> map = new HashMap<>();
       // AddressBook add = new AddressBook();
        Scanner scr = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            AddressBook add = new AddressBook();
            System.out.println("Enter Address Book Name");
            String addressBookName = scr.next();
            if (map.containsKey(addressBookName)) {
                System.out.println("address Book Already Exit");
            } else {
                map.put(addressBookName, add);
            }

            System.out.println("Enter options:\n1) To add contact\n2) To edit Contact\n3) To display Contacts\n4) To delete contact\n5)  Search City Or State\n6) Exit");
            int option = scr.nextInt();
            switch (option) {
                case 1:
                    map.get(addressBookName).addContact();
                    break;
                case 2:
                    map.get(addressBookName).editContact();
                    break;
                case 3:
                    map.get(addressBookName).displayContact();
                    break;
                case 4:
                    map.get(addressBookName).deleteContact();
                    break;

                case 5:
                    map.get(addressBookName).searchContact();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
        }
    }
}
