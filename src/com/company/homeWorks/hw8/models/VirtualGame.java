package com.company.homeWorks.hw8.models;

import com.company.homeWorks.hw8.enums.GameGenre;
import com.company.homeWorks.hw8.enums.GameMediaType;

// Class representing a VirtualGame
public class VirtualGame {
    private int rating;
    private final Game data;

    public VirtualGame(String name, GameGenre genre) {
        this.rating = 0;
        this.data = new Game(name, genre, GameMediaType.VIRTUAL);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Game getData() {
        return data;
    }
}