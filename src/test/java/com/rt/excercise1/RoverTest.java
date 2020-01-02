package com.rt.excercise1;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RoverTest {
    Rover rover;

    @Test
    public void givenInputF_ShouldReturnCoordinates_10(){
        // given
        String inputCommand = "F";
        int[] expectedCoordinates = {1,0};
        rover = new Rover();
        // then
        assertArrayEquals(expectedCoordinates, rover.move(inputCommand));
    }

    @Test
    public void givenInputLF_ShouldReturnCoordinates_01(){
        // given
        String inputCommand = "LF";
        int[] expectedCoordinates = {0,1};
        rover = new Rover();
        // then
        assertArrayEquals(expectedCoordinates, rover.move(inputCommand));
    }

    @Test
    public void givenInputRF_ShouldReturnCoordinates_0neg1(){
        // given
        String inputCommand = "RF";
        int[] expectedCoordinates = {0,-1};
        rover = new Rover();
        // then
        assertArrayEquals(expectedCoordinates, rover.move(inputCommand));
    }

    @Test
    public void givenInputLRF_ShouldReturnCoordinates_10() {
        // given
        String inputCommand = "LRF";
        int[] expectedCoordinates = {1, 0};
        rover = new Rover();
        // then
        assertArrayEquals(expectedCoordinates, rover.move(inputCommand));
    }

    @Test
    public void givenInputLFFFRFFFRRFFF_ShouldReturnCoordinates_03(){
        // given
        String inputCommand = "LFFFRFFFRRFFF";
        int[] expectedCoordinates = {0,3};
        rover = new Rover();
        // then
        assertArrayEquals(expectedCoordinates, rover.move(inputCommand));
    }
}