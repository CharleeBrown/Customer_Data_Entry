/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CustomerDataEntry;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;

class AppTest {
    @Test 
    public void appHasAGreeting() {
        App classUnderTest = new App();
        JPanel panel = new JPanel();
        assertNotEquals(panel, classUnderTest.createPanel());
    }
}
