package com.robotgame.command;

import com.robotgame.robot.Robot;

/**
 * Created by afghl on 16/10/19.
 */
public class TurnCommand implements Command {
    private String direction;

    public TurnCommand(String direction) {
        this.direction = direction;
    }

    public void solve(Robot robot) {
        robot.turn(direction);
    }
}
