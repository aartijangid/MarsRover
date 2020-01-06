package com.exercise1.application;

public class TurnRight extends Move {
    private Position position;

    public TurnRight(Position position) {
        this.position = position;
    }

    @Override
    public void execute() {
        if(position.currentDirection == 0)
            position.currentDirection = 270;
        else
            position.currentDirection -= 90;
    }
}
