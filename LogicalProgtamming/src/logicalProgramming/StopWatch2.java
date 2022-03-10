package logicalProgramming;

import java.math.BigInteger;

public class StopWatch2 {

    public static void main(String[] args) {

        StopWatch stopwatch1 = new StopWatch();
        stopwatch1.start();
        Fibonacci(45);
        stopwatch1.stop();


        System.out.println("Elapsed time in milliseconds: "
                + stopwatch1.getElapsedMilliseconds());

        System.out.println("Elapsed time in seconds: "
                + stopwatch1.getElapsedSeconds());

        System.out.println("Elapsed time in minutes: "
                + stopwatch1.getElapsedMinutes());

        System.out.println("Elapsed time in hours: "
                + stopwatch1.getElapsedHours());

    }

    private static BigInteger Fibonacci(int n) {
        if (n < 2)
            return BigInteger.ONE;
        else
            return Fibonacci(n - 1).add(Fibonacci(n - 2)); 
    }
}