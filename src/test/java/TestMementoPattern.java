import memento.CareTaker;
import org.junit.jupiter.api.Test;

public class TestMementoPattern {

    @Test
    public void test() throws InterruptedException {
        CareTaker careTaker = new CareTaker();
        careTaker.write("1.0");
        System.out.println("Created project: " + careTaker.getProject());
        Thread.sleep(5000);
        careTaker.write("1.1");
        System.out.println("Project after new version: " + careTaker.getProject());
        careTaker.write("1.2");
        System.out.println("Project after new version with defects: " + careTaker.getProject());
        Thread.sleep(5000);
        careTaker.undo();
        System.out.println("Project after rollback: " + careTaker.getProject());
    }
}
