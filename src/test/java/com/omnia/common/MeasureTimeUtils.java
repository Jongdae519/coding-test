package com.omnia.common;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Supplier;

public class MeasureTimeUtils {

    private MeasureTimeUtils() {
    }

    public static <T> T measureExecutionTime(String description, Supplier<T> code) {
        return measureExecutionTime(description, 5, code);
    }

    public static <T> T measureExecutionTime(String description, int warmUpCount, Supplier<T> code) {
        if (warmUpCount > 0) {
            System.out.println("JVM warm-up started for " + description + " with " + warmUpCount + " times");
            for (int i = 0; i < warmUpCount; i++) {
                code.get();
            }
            System.out.println("JVM warm-up ended for " + description + " with " + warmUpCount + " times");
        }

        Instant startTime = Instant.now();
        T result = code.get();
        Instant endTime = Instant.now();

        System.out.println(description + ": " + Duration.between(startTime, endTime).toNanos() + " ns");

        return result;
    }

    public static void measureExecutionTime(String description, Runnable code) {
        measureExecutionTime(description, 5, code);
    }

    public static void measureExecutionTime(String description, int warmUpCount, Runnable code) {
        if (warmUpCount > 0) {
            System.out.println("JVM warm-up started for " + description + " with " + warmUpCount + " times");
            for (int i = 0; i < warmUpCount; i++) {
                code.run();
            }
            System.out.println("JVM warm-up ended for " + description + " with " + warmUpCount + " times");
        }

        Instant startTime = Instant.now();
        code.run();
        Instant endTime = Instant.now();

        System.out.println(description + ": " + Duration.between(startTime, endTime).toNanos() + " ns");
    }
}
