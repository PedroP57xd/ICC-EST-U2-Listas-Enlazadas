package model;

public class Contacto {
    private String nombre;
    private String phone;

    public Contacto() {
    }

    public Contacto(String nombre, String phone) {
        this.nombre = nombre;
        this.phone = phone;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", phone=" + phone + "]";
    }

    
}
