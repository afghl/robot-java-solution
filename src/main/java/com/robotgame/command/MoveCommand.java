package com.robotgame.command;

import com.robotgame.robot.Robot;

class MoveCommand extends Command {

    public void safeSolve(Robot robot) {
        robot.move();
    }
}
