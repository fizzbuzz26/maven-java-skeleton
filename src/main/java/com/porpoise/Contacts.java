package com.porpoise;

import java.util.List;

public class Contacts {

    private List<Contacts> contacts;

    public Contacts() {
    }

    public Contacts(final List<Contacts> c) {
        contacts = c;
    }

    public List<Contacts> getContacts() {
        return contacts;
    }

    public void setContacts(final List<Contacts> contacts) {
        this.contacts = contacts;
    }

    public String getContactsAsString() {
        return contacts.toString();
    }
}
