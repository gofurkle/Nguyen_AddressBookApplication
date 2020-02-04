package com.company;

public class AddressBookApplication {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
//        Menu.prompt_FirstName();
//        Menu.prompt_LastName();
//        Menu.prompt_Street();
//        Menu.prompt_City();
//        Menu.prompt_State();
//        Menu.prompt_Zip();
//        Menu.prompt_Telephone();
//        Menu.prompt_Email();
        initAddressBookExercise(ab);
    }

    static void initAddressBookExercise(AddressBook ab) {
        AddressEntry entry1 = new AddressEntry("Jamie", "Nguyen", "123 abc", "San Jose", "Ca", 95132, "4085695564","jnguyen127@horizon.csueastbay.edu");
        AddressEntry entry2 = new AddressEntry();
        ab.add(entry1);
        ab.add(entry2);
        ab.list();
    }
}
