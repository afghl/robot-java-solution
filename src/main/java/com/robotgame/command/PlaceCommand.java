package com.robotgame.command;

import com.robotgame.robot.Robot;

/**
 * Created by afghl on 16/10/19.
 */
public class PlaceCommand implements Command {

    public void solve(Robot robot) {
        robot.setPlaced(true);
    }
}
