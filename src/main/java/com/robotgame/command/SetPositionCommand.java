package com.robotgame.command;

import com.robotgame.robot.Robot;

class SetPositionCommand extends Command {
    private int[] position;
    private String direction;

    public SetPositionCommand(int[] position, String direction) {
        this.position = position;
        this.direction= direction;
    }

    public void safeSolve(Robot robot) {
        robot.setPosition(position, direction);
    }
}
