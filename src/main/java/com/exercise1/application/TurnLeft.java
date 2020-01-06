package com.exercise1.application;

public class TurnLeft extends Move {
    private Position position;
    public TurnLeft(Position position) {
         this.position = position;
    }

    @Override
    public void execute() {
        position.currentDirection += 90;
        if(position.currentDirection == 360)
            position.currentDirection = 0;
    }
}
