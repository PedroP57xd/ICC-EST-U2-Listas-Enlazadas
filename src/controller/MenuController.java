package controller;

import view.ConsoleView;

public class MenuController {
    private ContactManager contactManager = new ContactManager();
    private ConsoleView consoleView = new ConsoleView();

    

    public MenuController(ContactManager contactManager, ConsoleView consoleView) {
        this.contactManager = contactManager;
        this.consoleView = consoleView;
    }

    public void showMenu() {
        while (true) {
            consoleView.displayMenu();
            String choice = consoleView.getInput("\n Selecciona una opción: ");
            switch (choice) {
                case "1":
                    String nam = consoleView.getInput("Nombre del contacto: ");
                    String name = nam.equalsIgnoreCase(choice) ? "" : nam;
                    if (name.isEmpty()|| name.equalsIgnoreCase("null")) {
                        consoleView.showMessage("\n El nombre no puede estar vacío.");
                        continue;
                    }
                    String phone = consoleView.getInput("Teléfono del contacto: ");
                    contactManager.addContact(new Contact(name, phone));
                    consoleView.showMessage("\n Contacto agregado.");
                    break;
                case "2":
                    nam = consoleView.getInput("\nNombre a buscar: ");
                    name = nam.equalsIgnoreCase(choice) ? "" : nam;
                    Contact found = contactManager.findContactByName(name);
                    consoleView.showMessage(found != null ? found.toString() : "\n Contacto no encontrado.");
                    break;
                case "3":
                    name = consoleView.getInput("\n Nombre a eliminar: ");
                    contactManager.deleteContactByName(name);
                    consoleView.showMessage("\n Contacto eliminado.");
                    break;
                case "4":
                    contactManager.printList();
                    break;
                case "5":
                    consoleView.showMessage("\n Saliendo...");
                    return;
                default:
                    consoleView.showMessage("\n Opción inválida.");
            }
        }
    }
}