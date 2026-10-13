package ru.otus.animals;

import java.util.ArrayList;
import java.util.List;

public enum Color {

    WHITE("белый"),
    BLACK("черный"),
    ORANGE("рыжий"),
    GRAY("серый"),
    BROWN("коричневый");

    private final String value;

    Color (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static List<String> VALUES = collectValues();

    public static List<String> collectValues() {
        List<String> result = new ArrayList<>();
        for (Color color : Color.values()) {
            result.add(color.name());
        }
        return result;
    }

    public static boolean doesNotContain(String value) {
        if (value == null) {
            return true;
        }
        return !VALUES.contains(value.toUpperCase().trim());
    }

    public static Color fromString(String value) {
        if (value == null) {
            return null;
        }
        return Color.valueOf(value.toUpperCase().trim());
    }
}
