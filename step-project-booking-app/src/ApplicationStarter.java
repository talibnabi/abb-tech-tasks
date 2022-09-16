import ui.abstracts.Menu;
import ui.concretes.BookingStartingPage;
import ui.concretes.UserStartingPage;


public class ApplicationStarter {
    public static void main(String[] args) {
        Menu menu = new UserStartingPage();
        Menu menu1 = new BookingStartingPage();
        System.out.println(menu.showInterface());
        System.out.println(menu1.showInterface());
    }
}
