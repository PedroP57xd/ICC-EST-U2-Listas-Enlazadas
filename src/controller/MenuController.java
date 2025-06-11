package controller;

import view.ConsoleView;

public class MenuController {
    private ContactManager contactManager = new ContactManager();
    private ConsoleView consoleView = new ConsoleView();

    public void showMenu() {
        while (true) {
            consoleView.displayMenu();
            String choice = consoleView.getInput("Selecciona una opción: ");
            switch (choice) {
                case "1":
                    String name = consoleView.getInput("Nombre del contacto: ");
                    String phone = consoleView.getInput("Teléfono del contacto: ");
                    contactManager.addContact(new Contact(name, phone));
                    consoleView.showMessage("Contacto agregado.");
                    break;
                case "2":
                    name = consoleView.getInput("Nombre a buscar: ");
                    Contact found = contactManager.findContactByName(name);
                    consoleView.showMessage(found != null ? found.toString() : "Contacto no encontrado.");
                    break;
                case "3":
                    name = consoleView.getInput("Nombre a eliminar: ");
                    contactManager.deleteContactByName(name);
                    consoleView.showMessage("Contacto eliminado.");
                    break;
                case "4":
                    contactManager.printList();
                    break;
                case "5":
                    consoleView.showMessage("Saliendo...");
                    return;
                default:
                    consoleView.showMessage("Opción inválida.");
            }
        }
    }
}