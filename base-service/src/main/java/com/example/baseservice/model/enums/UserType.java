package com.example.baseservice.model.enums;

public enum UserType {

    Default(0),
    Patient(1),
    Doctor(2),
    AI(3),
    Admin(4);

    private final int value;

    UserType(int value) {
        this.value = value;
    }

    public String getValue() {
        return switch (this.value) {
            case 0 -> "Default";
            case 1 -> "Patient";
            case 2 -> "Doctor";
            case 3 -> "AI";
            case 4 -> "Admin";
            default -> "Default";
        };

    }
}
