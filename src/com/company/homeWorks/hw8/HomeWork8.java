package com.company.homeWorks.hw8;

import com.company.homeWorks.hw8.enums.ConsoleBrand;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.company.homeWorks.interfaces.IHW;
import com.company.homeWorks.hw8.enums.*;
import com.company.homeWorks.hw8.models.*;

public class HomeWork8 implements IHW {

    @Override
    public void solve() {
        Scanner scanner = new Scanner(System.in);

        GameConsole gameConsole = new GameConsole(ConsoleBrand.SONY, "XC123QeWR");
        gameConsole.powerOn();

        // Create a collection of game disks
        List<GameDisk> gameDisks = new ArrayList<>();
        gameDisks.add(new GameDisk("Game1", GameGenre.ACTION, "Description1"));
        gameDisks.add(new GameDisk("Game2", GameGenre.SPORT, "Description2"));
        gameDisks.add(new GameDisk("Game3", GameGenre.RACE, "Description3"));
        gameDisks.add(new GameDisk("Game4", GameGenre.ACTION, "Description4"));
        gameDisks.add(new GameDisk("Game5", GameGenre.SPORT, "Description5"));
        gameDisks.add(new GameDisk("Game6", GameGenre.RACE, "Description6"));
        gameDisks.add(new GameDisk("Game7", GameGenre.ACTION, "Description7"));

        while (true) {
            System.out.println("\n=== Game Console Menu ===");
            System.out.println("1. Load Game");
            System.out.println("2. Change Game Disk");
            System.out.println("3. Play Game");
            System.out.println("4. Power Off");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loadGame(gameConsole, gameDisks);
                    break;
                case 2:
                    changeGameDisk(gameConsole, gameDisks);
                    break;
                case 3:
                    playGame(gameConsole);
                    break;
                case 4:
                    gameConsole.powerOff();
                    System.out.println("Game console powered off.");
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void loadGame(GameConsole gameConsole, List<GameDisk> gameDisks) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the game to load: ");
        String gameName = scanner.nextLine();
        GameDisk gameDisk = findGameDiskByName(gameName, gameDisks);

        if (gameDisk != null) {
            gameConsole.loadGame(gameDisk.getData());
            System.out.println("Game loaded: " + gameName);
        } else {
            System.out.println("Game not found.");
        }
    }

    private static void changeGameDisk(GameConsole gameConsole, List<GameDisk> gameDisks) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the new game disk: ");
        String diskName = scanner.nextLine();
        GameDisk newGameDisk = findGameDiskByName(diskName, gameDisks);

        if (newGameDisk != null) {
            gameConsole.loadGame(newGameDisk.getData());
            System.out.println("Game disk changed to: " + diskName);
        } else {
            System.out.println("Game disk not found.");
        }
    }

    private static void playGame(GameConsole gameConsole) {
        gameConsole.playGame();
    }

    private static GameDisk findGameDiskByName(String name, List<GameDisk> gameDisks) {
        for (GameDisk gameDisk : gameDisks) {
            if (gameDisk.getName().equalsIgnoreCase(name)) {
                return gameDisk;
            }
        }
        return null; // Game not found
    }
}
