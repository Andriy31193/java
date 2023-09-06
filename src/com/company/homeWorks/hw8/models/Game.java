package com.company.homeWorks.hw8.models;

import com.company.homeWorks.hw8.enums.GameGenre;
import com.company.homeWorks.hw8.enums.GameMediaType;

// Class representing a Game
public class Game {
    private final String name;
    private final GameGenre genre;
    private final GameMediaType type;

    public Game(String name, GameGenre genre, GameMediaType type) {
        this.name = name;
        this.genre = genre;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public GameGenre getGenre() {
        return genre;
    }

    public GameMediaType getType() {
        return type;
    }
}