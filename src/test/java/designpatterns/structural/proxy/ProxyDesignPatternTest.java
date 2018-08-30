package designpatterns.structural.proxy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by ramanathan on 29/08/18.
 */
public class ProxyDesignPatternTest {

    static List<String> restrictedCommands;
    static CommandExecutor executor;
    static String result;

    @BeforeAll
    static void setUp() {
        restrictedCommands = Arrays.asList("rm", "ifconfig");
        executor = new CommandExecutorProxy("ram", "password", restrictedCommands);
        result = null;
    }

    @DisplayName("Command Execution for Admin")
    @Test
    void testCommandExecutionForAdmin() {
        try {
            result = executor.executeCommand("ls");
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("EXCEPTION:" + exception.getMessage());
        }
        assertEquals(result, "'ls' - Command Executed");
    }

    @DisplayName("Command Execution for Non Admin - Restricted Command")
    @Test
    void testCommandExecutionForNonAdminWithRestrictedCommand() {
        executor = new CommandExecutorProxy("notadmin", "password", restrictedCommands);
        try {
            result = executor.executeCommand("rm");
        } catch (Exception exception) {
            assertEquals(exception.getMessage(), "rm not permitted for non admin users!");
        }

    }

    @DisplayName("Command Execution for Non Admin - Allowed Command")
    @Test
    void testCommandExecutionForNonAdminWithAllowedCommand() {
        executor = new CommandExecutorProxy("notadmin", "password", restrictedCommands);
        try {
            result = executor.executeCommand("ls");
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("EXCEPTION:" + exception.getMessage());
        }
        assertEquals(result, "'ls' - Command Executed");
    }

}
