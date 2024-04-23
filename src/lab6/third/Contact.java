package lab6.third;

abstract class Contact {
    Contact(){}
    public abstract String getPersonalData();
    public abstract String getPhone();

    public void printContactData() {
        System.out.println(getPersonalData() + " " + getPhone());
    }
}

class IPhoneContact extends Contact {
    int id;
    String name;
    String surname;
    String firstPhone;
    String secondPhone;
    String thirdPhone;
    IPhoneContact(){}
    IPhoneContact(int id, String name, String surname, String firstPhone, String secondPhone, String thirdPhone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.firstPhone = firstPhone;
        this.secondPhone = secondPhone;
        this.thirdPhone = thirdPhone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstPhone() {
        return firstPhone;
    }

    public String getSecondPhone() {
        return secondPhone;
    }

    public String getThirdPhone() {
        return thirdPhone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstPhone(String firstPhone) {
        this.firstPhone = firstPhone;
    }

    public void setSecondPhone(String secondPhone) {
        this.secondPhone = secondPhone;
    }

    public void setThirdPhone(String thirdPhone) {
        this.thirdPhone = thirdPhone;
    }

    @Override
    public String getPersonalData() {
        return "ID: " + id + ", Name: " + name + ", Surname: " + surname;
    }

    @Override
    public String getPhone() {
        return "Phones: " + firstPhone + ", " + secondPhone + ", " + thirdPhone;
    }
}

class SumsungContact extends Contact {
    private int id;
    private String fullName;
    private String[] phones = new String[10];

    public SumsungContact(int id, String fullName, String[] phones) {
        this.id = id;
        this.fullName = fullName;
        this.phones = phones;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

   @Override
   public String getPersonalData() {
        return "ID: " + id + "Full name: " + fullName;
   }

    @Override
    public String getPhone() {
        StringBuilder phoneList = new StringBuilder();
        phoneList.append("Phone number: ");
        for(String phone : phones ) {
            if (phone != null) {
                phoneList.append(phone).append(" ");
            }
        }
        return phoneList.toString();
    }
}

interface PhoneApplication {
    void addContact(Contact c);
    void printContacts();
}

class IPhoneApplication implements PhoneApplication {
    private String name;
    private Contact[] allContacts = new Contact[1000];
    private int contactSize = 0;

    public IPhoneApplication(String name) {
        this.name = name;
    }

    @Override
    public void addContact(Contact c) {
        allContacts[contactSize++] = c;
    }

    @Override
    public void printContacts() {
        System.out.println("Contacts in " + name + ":");
        for (int i = 0; i < contactSize; i++) {
            allContacts[i].printContactData();
        }
    }
}

class SumsungApplication implements PhoneApplication {
    private String name;
    private Contact[] allContacts = new Contact[500];
    private int contactSize = 0;

    public SumsungApplication(String name) {
        this.name = name;
    }

    @Override
    public void addContact(Contact c) {
        allContacts[contactSize++] = c;
    }

    @Override
    public void printContacts() {
        System.out.println("Contacts in " + name + ":");
        for (int i = 0; i < contactSize; i++) {
            allContacts[i].printContactData();
        }
    }
}
