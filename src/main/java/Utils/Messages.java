package Utils;

public class Messages {
    private static String messages = "";

    public static String getText() {
        return messages;
    }

    public static void addText(String text) {
        if (messages.length() == 0) {
            messages += text;
        } else {
            messages += "\n" + text;
        }
    }

    public static void clearText() {
        messages = "";
    }

    public static void printMessage(String text) {
        System.out.println(text);
        Messages.addText(text);
    }
}
