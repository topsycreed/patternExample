package templateMethod;

public class LoginPage extends WebSiteTemplate {
    public void showPage() {
        System.out.println("header");
        System.out.println("Please enter your login and password!");
        System.out.println("footer");
    }

    @Override
    public void showPageContent() {
        System.out.println("Please enter your login and password! using template!");
    }
}
