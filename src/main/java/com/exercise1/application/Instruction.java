package com.exercise1.application;

public enum Instruction {
    LEFT("L"),
    RIGHT("R"),
    FORWARD("F");

    private final String value;

    Instruction(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
