package designpatterns.structural.proxy;

import java.io.IOException;
import java.util.List;

/**
 * Created by ramanathan on 29/08/18.
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor commandExecutor;
    private List<String> restrictedCommands;

    public CommandExecutorProxy(String userName, String password, List<String> restrictedCommands) {
        if ("ram".equals(userName) && "password".equals(password)) {
            isAdmin = true;
        } else {
            isAdmin = false;
        }
        commandExecutor = new CommandExecutorImpl();
        this.restrictedCommands = restrictedCommands;
    }

    public String executeCommand(String command) throws Exception {
        if (isAdmin) {
            return commandExecutor.executeCommand(command);
        } else {
            if (restrictedCommands.contains(command.trim())) {
                throw new Exception(command + " not permitted for non admin users!");
            } else {
                return commandExecutor.executeCommand(command);
            }
        }
    }
}
