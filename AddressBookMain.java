package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    String name;
    int number;

    AddressBook addressBook = new AddressBook();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBookMain addressBookMain = new AddressBookMain();

        int number = 0;
         do {
            System.out.println("Enter options\n 1.Add details\n2.Edit details\n3.Delete details\n4.Exit");
            Scanner scanner = new Scanner(System.in);

             number = scanner.nextInt();
            addressBookMain.userOption(number);
        } while(number != 4);




        addressBookMain.addContactDetails();

        
    }

    void userOption(int number) {
        switch(number) {
            case 1:
                addContactDetails();
                System.out.println("Contact details added");
            break;
            case 2:
                modifyContactDetails();
            break;
            case 3:
                removeContactDetails();
            break;
            case 4:
                System.out.println("Add valid option");
            break;
        }
    }



        public void addContactDetails(){
        System.out.println("Enter name");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();

            Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter contact number");
        number = scanner1.nextInt();
        
        Map map = new HashMap();
            System.out.println(map);
        map.put(name,number);

            System.out.println(map);
    }
    
        public void removeContactDetails() {

        }

        public void modifyContactDetails() {
            System.out.println("name of person "+name);
        }
}
