package com.company.homeWorks.hw8.exceptions;

// Custom exception class for GameConsole
public class GameConsoleInactiveException extends RuntimeException {
    public GameConsoleInactiveException(String message) {
        super(message);
    }
}