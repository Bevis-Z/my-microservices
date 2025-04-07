package com.example.aiservice.enums;

public enum MessageType {

    Default(0),
    Text(1),
    AIProfileInvalid(2),
    AIText(3);

    private final int value;

    MessageType(int value) {
        this.value = value;
    }

    public String getValue() {
        return switch (this.value) {
            case 0 -> "Default";
            case 1 -> "Text";
            case 2 -> "AIProfileInvalid";
            case 3 -> "AIText";
            default -> "Default";
        };

    }
}
