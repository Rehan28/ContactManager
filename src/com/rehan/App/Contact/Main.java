package com.rehan.App.Contact;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContactsManager myContact = new ContactsManager();
        Contact rehan = new Contact();
        rehan.name = "Rehan";
        rehan.mail = "rehan17@cse.pstu.ac.bd";
        rehan.phoneNumber = "01796294755";
        myContact.addContact(rehan);

        Contact remon = new Contact();
        remon.name = "Remon";
        remon.mail = "remon@gmail.com";
        remon.phoneNumber = "016763847864";
        myContact.addContact(remon);

        Contact anik = new Contact();
        anik.phoneNumber = "017854378463";
        anik.mail = "anik@gmail.com";
        anik.name = "Anik";
        myContact.addContact(anik);

       Contact x = myContact.searchContact("Remon");
        System.out.println(x);
    }
}
