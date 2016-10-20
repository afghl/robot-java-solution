package com.robotgame.command;

import com.robotgame.robot.Robot;

class TurnCommand extends Command {
    private String direction;

    public TurnCommand(String direction) {
        this.direction = direction;
    }

    public void safeSolve(Robot robot) {
        robot.turn(direction);
    }
}
