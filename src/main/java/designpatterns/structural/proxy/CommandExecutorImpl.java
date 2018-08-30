package designpatterns.structural.proxy;

import java.io.IOException;

/**
 * Created by ramanathan on 29/08/18.
 */
public class CommandExecutorImpl implements CommandExecutor {
    public String executeCommand(String command) throws IOException {
        Process exec = Runtime.getRuntime().exec(command);
        return new StringBuilder("'").append(command).append("' - Command Executed").toString();
    }
}
