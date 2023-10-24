import mediator.Admin;
import mediator.SimpleTextChat;
import mediator.SimpleUser;
import mediator.User;
import org.junit.jupiter.api.Test;

public class TestMediatorPattern {

    @Test
    public void test() {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat, "Admin");
        User user1 = new SimpleUser(chat, "User1");
        User user2 = new SimpleUser(chat, "User2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello new World!");
        admin.sendMessage("Nice, I'm admin, please do not spam here!");
    }
}
