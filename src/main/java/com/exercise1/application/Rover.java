package com.exercise1.application;

import java.util.Scanner;

public class Rover {

    private static Position position;

    public void move(String inputInstruction) {
        String[] inputs = inputInstruction.split("");
        position = new Position();
        System.out.println("X: " + position.x + " Y: " + position.y + " direction: " + position.currentDirection);


        for (int i = 0; i < inputs.length; i++) {
            setDirection(inputs[i]);
            if(inputs[i].equals(Instruction.FORWARD.getValue())) {
                Forward forward = new Forward(position);
                forward.execute();
            }
        }
    }

    private void setDirection(String inputInstruction) {
        if (inputInstruction.equals(Instruction.LEFT.getValue())) {
            TurnLeft turnLeft = new TurnLeft(position);
            turnLeft.execute();
        }
        else if (inputInstruction.equals(Instruction.RIGHT.getValue())) {
            TurnRight turnRight = new TurnRight(position);
            turnRight.execute();
        }
    }

    private void displayPosition() {
        System.out.println(position.x + " " + position.y);
    }

    public static void main( String[] args )
    {
        String instruction;
        Rover rover = new Rover();

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter instruction: ");
                instruction =  scanner.nextLine();
                if(instruction.matches("[LRF]+")) {
                    rover.move(instruction);
                    rover.displayPosition();
                }
                else
                    System.out.println("Skipping invalid instruction: " + instruction);
            }
        }
    }
}
