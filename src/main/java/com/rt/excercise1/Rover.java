package com.rt.excercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Rover {
    int x;
    int y;
    int direction = 0;
    int[] coordinates = {x,y};

    public int[] move(String inputCommand) {
        x = 0;
        y = 0;
        String[] inputs = inputCommand.split("");
        for (int i = 0; i < inputs.length; i++) {
            setDirection(inputs[i]);
            if(inputs[i].equals("F")) {
                if (direction == 0)
                    x++;
                else if(direction == 90)
                    y++;
                else if(direction == 180)
                    x--;
                else if(direction == 270)
                    y--;
            }
        }
        coordinates = new int[]{x, y};
        return coordinates;
    }

    private void setDirection(String inputCommand) {
        if (inputCommand.equals("L"))
            direction += 90;
        else if (inputCommand.equals("R"))
            if(direction == 0)
                direction = 270;
            else
                direction -= 90;

    }

    public static void main( String[] args )
    {
        int[] position = new int[0];
        String instruction;
        Rover rover = new Rover();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter instruction: ");
                instruction = scanner.nextLine();
                if(instruction.matches("[LRFlrf]+")) {
                    position = rover.move(instruction);
                    System.out.println(Arrays.toString(position));
                }
                else
                    System.out.println("Please enter valid instruction.");
            }
        }
    }
}
