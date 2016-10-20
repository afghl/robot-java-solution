package com.robotgame.command;

import com.robotgame.robot.Robot;

public abstract class Command {
    public void solve(Robot robot) {
        if (!robot.isPlaced()) return;
        safeSolve(robot);
    }

    protected abstract void safeSolve(Robot robot);
}
