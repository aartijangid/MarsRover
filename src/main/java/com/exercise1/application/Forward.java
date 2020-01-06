package com.exercise1.application;

public class Forward extends Move {
    private Position currentPosition;


    public Forward(Position position) {
        this.currentPosition = position;
    }

    @Override
    public void execute() {
        if (currentPosition.currentDirection == 0)
            currentPosition.x ++;
        else if(currentPosition.currentDirection == 90)
            currentPosition.y++;
        else if(currentPosition.currentDirection == 180)
            currentPosition.x--;
        else if(currentPosition.currentDirection == 270)
            currentPosition.y--;
    }
}
