package com.omnia.chapter6stringmanipulation.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReorderLogFile {

    sealed interface LogFile extends Comparable<LogFile> permits Letter, Digit {
        String id();
        String contents();
    }

    record Letter(String id, String contents) implements LogFile {
        @Override
        public int compareTo(LogFile logFile) {
            return switch (logFile) {
                case Letter l -> {
                    int result = this.contents.compareTo(logFile.contents());
                    if (result != 0) {
                        yield result;
                    }
                    yield this.id.compareTo(logFile.id());
                }
                case Digit ignored -> -1;
            };
        }

        @Override
        public String toString() {
            return this.id + " " + this.contents;
        }
    }

    record Digit(String id, String contents) implements LogFile {
        @Override
        public int compareTo(LogFile logFile) {
            return switch (logFile) {
                case Letter ignored -> 1;
                // id 순서대로 하는 경우
//                case Digit d -> this.id.compareTo(logFile.id());
                // 입력 순서대로 하는 경우
                case Digit ignored -> 0;
            };
        }

        @Override
        public String toString() {
            return this.id + " " + this.contents;
        }
    }

    public static String[] reorderLogFile(String[] logs) {
        List<LogFile> logFileList = Arrays.stream(logs).map(log -> {
            String[] parts = log.split(" ", 2);
            String id = parts[0];
            String contents = parts[1];

            if (Character.isDigit(contents.charAt(0))) {
                return new Digit(id, contents);
            }
            return new Letter(id, contents);
        }).collect(Collectors.toList());

        Collections.sort(logFileList);

        return logFileList.stream().map(LogFile::toString).toArray(String[]::new);
    }

    /**
     * Answer
     */
    public static String[] reorderLogFileAnswer(String[] logs) {
        List<String> letterList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();

        for (String log : logs) {
            if (Character.isDigit(log.split(" ")[1].charAt(0))) {
                digitList.add(log);
            } else {
                letterList.add(log);
            }
        }

        letterList.sort((s1, s2) -> {
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);

            int compared = s1x[1].compareTo(s2x[1]);
            if (compared == 0) {
                return s1x[0].compareTo(s2x[0]);
            } else {
                return compared;
            }
        });

        letterList.addAll(digitList);

        return letterList.toArray(new String[0]);

    }
}
