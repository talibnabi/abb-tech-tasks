import ui.abstracts.Menu;
import ui.concretes.BookingUIPage;
import ui.concretes.UserUIPage;


public class ApplicationStarter {
    public static void main(String[] args) {
        Menu menu = new UserUIPage();
        Menu menu1 = new BookingUIPage();
        System.out.println(menu.showInterface());
        System.out.println(menu1.showInterface());
    }
}
