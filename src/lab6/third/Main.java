package lab6.third;

public class Main {
    public static void main(String[] args) {
        IPhoneContact[] iPhoneContacts = new IPhoneContact[10];
        for(int i=0;i<10;i++) {
            iPhoneContacts[i] = new IPhoneContact(i+1, "Name" + (i+1), "Surname" + (i+1),
                    "123-123-123" + i, "456-456-456" + i, "789-789-789" + i);
        }

        SumsungContact[] samsungContacts = new SumsungContact[10];
        for (int i = 0; i < 10; i++) {
            String[] phones = new String[]{"123-123-123" + i, "456-456-456" + i, "789-789-789" + i};
            samsungContacts[i] = new SumsungContact(i+1, "FullName" + (i+1), phones);
        }

        IPhoneApplication iPhoneApp = new IPhoneApplication("IPhone Application");
        for (IPhoneContact contact : iPhoneContacts) {
            iPhoneApp.addContact(contact);
        }

        SumsungApplication samsungApp = new SumsungApplication("Sumsung Application");
        for (SumsungContact contact : samsungContacts) {
            samsungApp.addContact(contact);
        }

        iPhoneApp.printContacts();
        System.out.println();
        samsungApp.printContacts();
    }
}
