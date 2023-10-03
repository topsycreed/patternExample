import chainOfResponsobility.*;
import org.junit.jupiter.api.Test;

public class TestChainOfResponsobilityPattern {

    @Test
    public void bugTrackerNotifierTest() {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is ok", Priority.ROUTINE);
        reportNotifier.notifyManager("Something wrong", Priority.IMPORTANT);
        reportNotifier.notifyManager("We have a big problem!", Priority.ASAP);
    }
}
