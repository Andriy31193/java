package com.company.homeWorks.hw8.models;

import com.company.homeWorks.hw8.enums.*;
import com.company.homeWorks.hw8.exceptions.GameConsoleInactiveException;
import com.company.homeWorks.hw8.interfaces.Powered;

// Class representing a GameConsole
public class GameConsole implements Powered {
    private final ConsoleBrand brand;
    private final String serial;
    private final Gamepad firstGamepad;
    private final Gamepad secondGamepad;
    private boolean isOn;
    private Game activeGame;
    private int waitingCounter;

    public GameConsole(ConsoleBrand brand, String serial) {
        this.brand = brand;
        this.serial = serial;
        this.firstGamepad = new Gamepad(brand, 1, serial);
        this.secondGamepad = new Gamepad(brand, 2, serial);
        this.isOn = false;
    }

    // Static factory method to create GameDisk
    public static GameDisk getDisk(String name, GameGenre genre, String description) {
        return new GameDisk(name, genre, description);
    }
    // Static factory method to create VirtualGame
    public static VirtualGame getVirtualGame(String name, GameGenre genre) {
        return new VirtualGame(name, genre);
    }
    public ConsoleBrand getBrand() {
        return brand;
    }

    public String getSerial() {
        return serial;
    }

    public Gamepad getFirstGamepad() {
        return firstGamepad;
    }

    public Gamepad getSecondGamepad() {
        return secondGamepad;
    }

    public boolean isOn() {
        return isOn;
    }

    public Game getActiveGame() {
        return activeGame;
    }

    public void setActiveGame(Game activeGame) {
        this.activeGame = activeGame;
    }

    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            waitingCounter = 0;
            System.out.println("Game console is powered on.");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Game console is powered off.");
        }
    }

    public void loadGame(Game game) {
        setActiveGame(game);
        System.out.println("Loading game: " + game.getName());
    }

    public void playGame() {
        if (!isOn) {
            System.out.println("Game console is powered off. Please turn it on to play.");
            return;
        }

        if (activeGame == null) {
            System.out.println("No game loaded. Please load a game to play.");
            return;
        }

        checkStatus();

        System.out.println("Playing " + activeGame.getName());
        System.out.println("Battery Status:");
        System.out.println("Gamepad 1: " + firstGamepad.getChargeLevel() + "%");
        System.out.println("Gamepad 2: " + secondGamepad.getChargeLevel() + "%");

        firstGamepad.decreaseChargeLevel(10);
        secondGamepad.decreaseChargeLevel(10);

        if (firstGamepad.getChargeLevel() <= 0) {
            firstGamepad.powerOff();
        }

        if (secondGamepad.getChargeLevel() <= 0) {
            secondGamepad.powerOff();
        }
    }

    private void checkStatus() {
        if (!firstGamepad.isOn() && !secondGamepad.isOn()) {
            waitingCounter++;
            if (waitingCounter > 5) {
                powerOff();
                throw new GameConsoleInactiveException("Game console shuts down due to inactivity.");
            }
        } else {
            waitingCounter = 0;
        }
    }
}

