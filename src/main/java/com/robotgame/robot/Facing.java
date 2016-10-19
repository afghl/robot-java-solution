package com.robotgame.robot;

class Facing {
    private static final String[] DIRECTIONS = { "EAST", "SOUTH", "WEST", "NORTH" };
    private int directionIndex;

    public Facing() {
        directionIndex = 0;
    }

    int[] solveMove(int[] position) {
        switch (directionIndex) {
            case 0:
                position[0]++;
                break;
            case 1:
                position[1]--;
                break;
            case 2:
                position[0]--;
                break;
            case 3:
                position[1]++;
                break;
        }
        return position;
    }

    public void setDirection(String str) {
        for (int i = 0; i < DIRECTIONS.length; i++)
            if (DIRECTIONS[i].equals(str))
                directionIndex = i;
    }

    public void turn(String turn) {
        if ("LEFT".equals(turn)) {
            directionIndex--;
        } else if ("RIGHT".equals(turn)) {
            directionIndex++;
        }

        if (directionIndex == -1) {
            directionIndex = DIRECTIONS.length - 1;
        } else if (directionIndex == DIRECTIONS.length) {
            directionIndex = 0;
        }
    }

    @Override
    public String toString() {
        return DIRECTIONS[directionIndex];
    }
}