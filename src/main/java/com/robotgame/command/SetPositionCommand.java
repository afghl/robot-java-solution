package com.robotgame.command;

import com.robotgame.robot.Robot;

/**
 * Created by afghl on 16/10/19.
 */
public class SetPositionCommand extends Command {
    private int[] position;
    private String direction;

    public SetPositionCommand(int[] position, String direction) {
        this.position = position;
        this.direction= direction;
    }

    public void solve(Robot robot) {
        robot.setPosition(position, direction);
    }
}
