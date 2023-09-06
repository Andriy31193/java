package com.company.homeWorks.hw8.models;

import com.company.homeWorks.hw8.enums.GameGenre;
import com.company.homeWorks.hw8.enums.GameMediaType;

// Class representing a GameDisk
public class GameDisk {
    private final String description;
    private final String name;
    private final Game data;

    public GameDisk(String name, GameGenre genre, String description) {
        this.name = name;
        this.description = description;
        this.data = new Game(name, genre, GameMediaType.PHYSICAL);
    }

    public String getDescription() {
        return description;
    }

    public Game getData() {
        return data;
    }
    public String getName() {
        return name;
    }
}
