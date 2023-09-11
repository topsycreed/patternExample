package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import proxy.lazyInit.Project;
import proxy.lazyInit.ProxyProject;
import proxy.lazyInit.RealProject;
import utils.Messages;

import static constants.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLazyProxy {

    @BeforeEach
    public void clearMessages() {
        Messages.clearText();
    }

    @Test
    public void testRealProject() {
        Project project = new RealProject("https://github.com/topsycreed/patternExample/");
        assertEquals(WITHOUT_LAZY_PROXY, Messages.getText());
        project.run();
        assertEquals(FULL_PROXY_MSG, Messages.getText());
    }

    @Test
    public void testProxyProject() {
        Project project = new ProxyProject("https://github.com/topsycreed/patternExample/");
        assertEquals(WITH_LAZY_PROXY, Messages.getText());
        project.run();
        assertEquals(FULL_PROXY_MSG, Messages.getText());
    }
}
