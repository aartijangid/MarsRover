package com.exercise2;

public class CountingWithoutLoops {

    private void countUp(int start, int end) {
        if(start <= end) {
            System.out.println(start);
            countUp(start+1, end);
        }
        return;
    }

    private void countUpAndDown(int start, int end) {
        System.out.println(start);
        if (end == start)
            return;

        countUpAndDown(start+1, end);

        System.out.println(start);

        return;
    }

    public static void main( String[] args ){
        CountingWithoutLoops countingWithoutLoops = new CountingWithoutLoops();
        System.out.println("countUp:");
        countingWithoutLoops.countUp(0, 5);

        System.out.println("countUpAndDown:");
        countingWithoutLoops.countUpAndDown(0,5);
    }
}
