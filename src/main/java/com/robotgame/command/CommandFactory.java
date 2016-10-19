package com.robotgame.command;

/**
 * Created by afghl on 16/10/19.
 */
public class CommandFactory {
    public static Command create(String s) {
        if ("PLACE".equals(s)) {
            return new PlaceCommand();
        } else if ("MOVE".equals(s)) {
            return new MoveCommand();
        } else if ("LEFT".equals(s) || "RIGHT".equals(s)) {
            return new TurnCommand(s);
        } else if ("REPORT".equals(s)) {
            return new ReportCommand();
        } else {
            return new SetPositionCommand(new int[]{ 1, 2 }, "EAST");
        }
    }
}
