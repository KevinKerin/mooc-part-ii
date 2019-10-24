
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinkerin
 */
public class Phonebook {
    
   // private Map<Contact, Set<String>> contacts;
    private List<Contact> contactList;
    
    public Phonebook(Scanner reader){
        contactList = new ArrayList<Contact>();
    }
    
    public void addNumber(Scanner reader){
        System.out.print("\rwhose number: ");
        String name = reader.nextLine();
        System.out.print("\rnumber: ");
        String number = reader.nextLine();
        for (Contact c : contactList){
            if (c.getName().equalsIgnoreCase(name)){
                c.addNumber(number);
                return;
            }
        }
        contactList.add(new Contact(name, number, "address unknown"));
    }
    
    public void numberSearch(Scanner reader){
        System.out.print("\rwhose number: ");
        String name = reader.nextLine();
        for (Contact c : contactList){
            if (c.getName().equalsIgnoreCase(name)){
                c.printNumberSet();
                return;
            }
        }
        System.out.println("  not found");
    }
    
    public void addAddress(Scanner reader){
        System.out.print("\rwhose address: ");
        String name = reader.nextLine();
        System.out.print("\rstreet: ");
        String address = reader.nextLine();
        System.out.print("\rcity: ");
        address += " " + reader.nextLine();
        for (Contact c : contactList){
            if (c.getName().equalsIgnoreCase(name)){
                c.addAddress(address);
                return;
            }
        }
        contactList.add(new Contact(name, null, address));
    }
    
    public void searchByNumber(Scanner reader){
        System.out.print("\rnumber: ");
        String number = reader.nextLine();
        for (Contact c : contactList){
            if(c.numberSet.contains(number)){
                System.out.println(" " + c.getName());
                return;
            }
        }
        System.out.println(" not found");
    }
    
    public void personalInfoSearch(Scanner reader){
        System.out.print("\rwhose information: ");
        String name = reader.nextLine();
        for (Contact c : contactList){
            if(c.getName().equals(name)){
                System.out.println(c.toString());
                return;
            }
        }
        System.out.println("  not found");
    }
    
    public Contact searchList(String name){
        for (Contact c : contactList){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return null;
    }
    
    public void delete(Scanner reader){
        System.out.print("\rwhose information: ");
        String name = reader.nextLine();
        if(searchList(name) != null){
            Contact c = searchList(name);
            contactList.remove(c);
        }
    }
    
    public void filteredSearch(Scanner reader){
        List<Contact> list = new ArrayList<Contact>();
        System.out.print("\rkeyword (if empty, all listed): ");
        String search = reader.nextLine();
        if (search.isEmpty()) {
            sortList(contactList);
            for (Contact c : contactList) {
                System.out.println("\n " + c.getName());
                System.out.println(c.toString());
            }
            return;
        }
        for (Contact c : contactList) {
            if (c.getName().contains(search) || c.getAddress().contains(search)){
                list.add(c);
            }
            sortList(list);
        }
        if(list.isEmpty()){
            System.out.println(" keyword not found");
            return;
        }
        for (Contact c : list) {
            System.out.println("\n " + c.getName());
            System.out.println(c.toString());
        }
    }
    
    public void sortList(List<Contact> list) {
        Collections.sort(list, new SortList());
    }    

}