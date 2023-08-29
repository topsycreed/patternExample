package proxy.lazyInit;

import static utils.Messages.printMessage;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        this.load();
    }

    public void load() {
        printMessage("Loaded project from: " + url);
    }

    @Override
    public void run() {
        printMessage("Started project from: " + url);
    }
}
