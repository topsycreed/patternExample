package utils;

public class Messages {
    private static StringBuffer messages = new StringBuffer();

    public static String getText() {
        return messages.toString();
    }

    public static void addText(String text) {
        if (messages.length() == 0) {
            messages.append(text);
        } else {
            messages.append("\n").append(text);
        }
        char test = 'h';
        String char1 = String.valueOf(test);
    }

    public static void clearText() {
        messages = new StringBuffer();
    }

    public static void printMessage(String text) {
        System.out.println(text);
        Messages.addText(text);
    }
}
