package Behavioural_pattern.ex1_1;

import java.util.Stack;
import java.util.ArrayList;

public class SmartOfficeController {

    private Stack<Command> history = new Stack<>();
    private ArrayList<String> logs = new ArrayList<>();

    public void pressButton(Command command) {

        command.execute();

        history.push(command);

        logs.add(command.getClass().getSimpleName());
    }

    public void undoButton() {

        if(!history.empty()) {

            Command command = history.pop();

            command.undo();

            System.out.println("Undo success");
        }
    }

    public void showLogs() {

        System.out.println("===== LOGS =====");

        for(int i = 0; i < logs.size(); i++) {
            System.out.println(logs.get(i));
        }
    }
}