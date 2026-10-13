package ru.otus.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public enum AnimalType {

    CAT,
    DOG,
    DUCK;

    public static List<String> VALUES = collectValues();

    public static List<String> collectValues() {
        List<String> result = new ArrayList<>();
        for (AnimalType type : AnimalType.values()) {
            result.add(type.name());
        }
        return result;
    }

    public static boolean doesNotContain (String value) {
        if (value == null) {
            return true;
        }
        return !VALUES.contains(value.toUpperCase().trim());
    }
    public static AnimalType fromString(String value) {
        if (value == null) {
            return null;
        }
        return AnimalType.valueOf(value.toUpperCase().trim());
    }
}
