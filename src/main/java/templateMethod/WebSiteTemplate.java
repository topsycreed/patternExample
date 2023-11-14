package templateMethod;

public abstract class WebSiteTemplate {
    public void showPageUsingTemplate() {
        System.out.println("header");
        showPageContent();
        System.out.println("footer");
    }

    public abstract void showPageContent();
}
