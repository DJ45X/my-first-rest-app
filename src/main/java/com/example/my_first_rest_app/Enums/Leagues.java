package com.example.my_first_rest_app.Enums;

import lombok.Getter;

@Getter
public enum Leagues {
    GRAND("Grand"),
    EXPERT("Expert"),
    JOURNEYMAN("Journeyman"),
    APPRENTICE("Apprentice"),
    ROOKIE("Rookie");

    private final String name;

    Leagues(String name) {
        this.name = name;
    }
}
