package com.example.my_first_rest_app.Enums;

import lombok.Getter;

@Getter
public enum Teams {
    CENTAURS("Centaurs"),
    CERBERUS("Cerberus"),
    CROCS("Crocs"),
    CYBORGS("Cyborgs"),
    GRIFFINS("Griffins"),
    GUARDIANS("Guardians"),
    IGUANAS("Iguanas"),
    MARKSMEN("Marksmen"),
    ONI("Oni"),
    PALADINS("Paladins"),
    PEGASUS("Pegasus"),
    SCORPIONS("Scorpions"),
    SHADOWS("Shadows"),
    SHINOBI("Shinobi"),
    SPIDERS("Spiders"),
    WYVERNS("Wyverns"),
    FREE_AGENT("Free Agent"),
    NON_PLAYER("Non-Player");

    private final String name;

    Teams(String name) {
        this.name = name;
    }
}
