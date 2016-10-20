package com.robotgame.command;

import com.robotgame.robot.Robot;

class ReportCommand extends Command {

    public void safeSolve(Robot robot) {
        System.out.println(robot);
    }
}
