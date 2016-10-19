package com.robotgame;


import com.robotgame.command.Command;
import com.robotgame.command.CommandFactory;
import com.robotgame.robot.Robot;

public class PlayGround {
    public static void main(String[] args) {
        Robot robot = new Robot();

        String str = "PLACE 1,2,EAST MOVE MOVE LEFT MOVE REPORT";
        String[] c = str.split(" ");
        Command command;
        for (int i = 0; i < c.length; i++) {
            command = CommandFactory.create(c[i]);
            robot.accept(command);
        }

    }
}
