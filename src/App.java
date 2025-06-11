
import controller.ContactManager;
import controller.MenuController;
import view.ConsoleView;

public class App {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        ContactManager manager = new ContactManager();
        MenuController controller = new MenuController(manager, view);

        controller.showMenu();
    }
}