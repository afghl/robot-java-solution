package com.robotgame.robot;

import com.robotgame.command.Command;

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
        command.solve(this);
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

    public boolean isPlaced() {
        return isPlaced;
    }

    @Override
    public String toString() {
        return facing.toString() + Arrays.toString(position);
    }
}
