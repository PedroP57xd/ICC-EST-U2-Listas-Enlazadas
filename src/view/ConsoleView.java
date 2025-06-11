package view;


public class ConsoleView {
    public void displayMenu() {
        System.out.println("1. Agregar contacto\n2. Buscar contacto\n3. Eliminar contacto\n4. Mostrar lista\n5. Salir");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return System.console().readLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

