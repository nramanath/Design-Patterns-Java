package designpatterns.structural.proxy;

import java.io.IOException;

/**
 * Created by ramanathan on 29/08/18.
 */
public interface CommandExecutor {
    String executeCommand(String command) throws Exception;
}
