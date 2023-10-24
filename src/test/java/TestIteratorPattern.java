import iterator.Iterator;
import iterator.JavaDeveloper;
import org.junit.jupiter.api.Test;

public class TestIteratorPattern {

    @Test
    public void test() {
        String[] skills = {"Java", "Spring", "Maven", "Hibernate"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Gena Chursov", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Name: " + javaDeveloper.getName());
        System.out.print("Skills: ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
