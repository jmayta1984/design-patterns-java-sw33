package behavioral.command.example02;

import java.util.ArrayList;

// invoker: invoca al execute
public class Broker {

    ArrayList<Command> commands = new ArrayList<>();

    void takeCommand(Command command){
        commands.add(command);
    }

    void processCommands(){
        for (Command command: commands){
            command.execute();
        }
        commands.clear();
    }
}
