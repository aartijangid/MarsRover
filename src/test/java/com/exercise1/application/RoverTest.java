package com.exercise1.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RoverTest {
    Rover rover;

    @Test
    public void givenInputF_ShouldReturnCoordinates_10(){
        // given
        String inputInstruction = "F";
        int[] expectedPosition = {1,0};
        rover = new Rover();
        // then
        assertArrayEquals(expectedPosition, rover.move(inputInstruction));
    }

    @Test
    public void givenInputLF_ShouldReturnCoordinates_01(){
        // given
        String inputInstruction = "LF";
        int[] expectedPosition = {0,1};
        rover = new Rover();
        // then
        assertArrayEquals(expectedPosition, rover.move(inputInstruction));
    }

    @Test
    public void givenInputRF_ShouldReturnCoordinates_0neg1(){
        // given
        String inputInstruction = "RF";
        int[] expectedPosition = {0,-1};
        rover = new Rover();
        // then
        assertArrayEquals(expectedPosition, rover.move(inputInstruction));
    }

    @Test
    public void givenInputLRF_ShouldReturnCoordinates_10() {
        // given
        String inputInstruction = "LRF";
        int[] expectedPosition = {1, 0};
        rover = new Rover();
        // then
        assertArrayEquals(expectedPosition, rover.move(inputInstruction));
    }

    @Test
    public void givenInputLRF_ShouldReturnCoordinates_0neg1() {
        // given
        String inputInstruction = "LLLF";
        int[] expectedPosition = {0, -1};
        rover = new Rover();
        // then
        assertArrayEquals(expectedPosition, rover.move(inputInstruction));
    }

    @Test
    public void givenInputLRF_ShouldReturnCoordinates_neg10() {
        // given
        String inputInstruction = "RRRF";
        int[] expectedPosition = {0, 1};
        rover = new Rover();
        // then
        assertArrayEquals(expectedPosition, rover.move(inputInstruction));
    }

    @Test
    public void givenInputLFFFRFFFRRFFF_ShouldReturnCoordinates_03(){
        // given
        String inputInstruction = "LFFFRFFFRRFFF";
        int[] expectedPosition = {0,3};
        rover = new Rover();
        // then
        assertArrayEquals(expectedPosition, rover.move(inputInstruction));
    }
}