import console.abstracts.Menu;
import console.concretes.BookingItemMenu;
import console.concretes.UserItemMenu;

public class ApplicationStarter {
    public static void main(String[] args) {
        Menu menu = new UserItemMenu();
        Menu menu1 = new BookingItemMenu();
        System.out.println(menu.showInterface());
        System.out.println(menu1.showInterface());
    }
}
