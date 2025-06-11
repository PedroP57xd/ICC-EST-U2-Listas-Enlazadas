package model;

import java.util.LinkedList;

// Modelo de contacto con datos adicionales
class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Teléfono: " + phone;
    }
}
