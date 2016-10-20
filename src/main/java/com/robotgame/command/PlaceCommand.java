package com.robotgame.command;

import com.robotgame.robot.Robot;

/**
 * Created by afghl on 16/10/19.
 */
public class PlaceCommand extends Command {

    public void solve(Robot robot) {
        robot.setPlaced(true);
    }
}
