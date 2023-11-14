package templateMethod;

public class ProductsPage extends WebSiteTemplate {
    public void showPage() {
        System.out.println("header");
        System.out.println("List of products!");
        System.out.println("footer");
    }

    @Override
    public void showPageContent() {
        System.out.println("List of products! using template!");
    }
}
