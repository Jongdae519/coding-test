package com.omnia.javaalgorithminterview.chapter6stringmanipulation;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Supplier;

public class MeasureTimeUtils {

    private MeasureTimeUtils() {
    }

    public static <T> T measureExecutionTime(String description, Supplier<T> code) {
        Instant startTime = Instant.now();
        T result = code.get();
        Instant endTime = Instant.now();

        System.out.println(description + ": " + Duration.between(startTime, endTime).toNanos() + " ns");

        return result;
    }

    public static void measureExecutionTime(String description, Runnable code) {
        Instant startTime = Instant.now();
        code.run();
        Instant endTime = Instant.now();

        System.out.println(description + ": " + Duration.between(startTime, endTime).toNanos() + " ns");
    }
}
