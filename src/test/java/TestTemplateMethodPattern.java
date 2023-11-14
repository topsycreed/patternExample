import org.junit.jupiter.api.Test;
import templateMethod.LoginPage;
import templateMethod.ProductsPage;
import templateMethod.WebSiteTemplate;

public class TestTemplateMethodPattern {

    @Test
    public void test() {
        LoginPage loginPage = new LoginPage();
        ProductsPage productsPage = new ProductsPage();

        loginPage.showPage();
        System.out.println("***************************************");
        productsPage.showPage();
        System.out.println("***************************************");

        WebSiteTemplate loginPage2 = new LoginPage();
        WebSiteTemplate productsPage2 = new ProductsPage();
        loginPage2.showPageUsingTemplate();
        System.out.println("***************************************");
        productsPage2.showPageUsingTemplate();
    }
}
