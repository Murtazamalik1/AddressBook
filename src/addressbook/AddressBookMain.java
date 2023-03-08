package addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book System");
        Contact contact = new Contact();
        contact.setFirstName("Murtaza");
        System.out.println(contact.getFirstName());
    }
}
