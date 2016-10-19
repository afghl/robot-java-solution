package com.robotgame.robot;

import com.robotgame.command.Command;
import com.robotgame.command.PlaceCommand;

import java.util.Arrays;

public class Robot {
    private Facing facing;
    private int[] position;
    private boolean isPlaced;

    public Robot() {
        isPlaced = false;
        facing = new Facing();
        position = new int[]{0, 0};
    }

    public void accept(Command command) {
        // TODO: // FIXME: 16/10/19
        if (isPlaced || command instanceof PlaceCommand) {
            command.solve(this);
        }
    }

    public void move() {
        facing.solveMove(position);
    }

    public void setPosition(int[] position, String direction) {
        this.position = position;
        this.facing.setDirection(direction);
    }

    public void turn(String turn) {
        facing.turn(turn);
    }

    public void setPlaced(boolean placed) {
        isPlaced = placed;
    }

    @Override
    public String toString() {
        return facing.toString() + Arrays.toString(position);
    }
}
