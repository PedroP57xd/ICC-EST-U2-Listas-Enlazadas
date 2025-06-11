package controller;

import java.util.LinkedList;

class ContactManager {
    private LinkedList<Contact> contacts = new LinkedList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void deleteContactByName(String name) {
        contacts.removeIf(contact -> contact.getName().equals(name));
        }

    public void printList() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

}

// Modelo de contacto con parámetros genéricos
class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
        public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Teléfono: " + phone;
    }
}
