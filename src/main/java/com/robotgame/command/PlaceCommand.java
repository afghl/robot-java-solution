package com.robotgame.command;

import com.robotgame.robot.Robot;

class PlaceCommand extends Command {

    public void solve(Robot robot) {
        robot.setPlaced(true);
    }

    @Override
    protected void safeSolve(Robot robot) {
        // do nothing.
    }
}
