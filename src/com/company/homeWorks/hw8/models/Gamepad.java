package com.company.homeWorks.hw8.models;


import com.company.homeWorks.hw8.enums.ConsoleBrand;
import com.company.homeWorks.hw8.enums.GamepadColor;
import com.company.homeWorks.hw8.interfaces.*;


// Class representing a Gamepad
public class Gamepad implements Powered {
    private final ConsoleBrand brand;
    private final String consoleSerial;
    private final int connectedNumber;
    private final GamepadColor color;
    private double chargeLevel;
    private boolean isOn;

    public Gamepad(ConsoleBrand brand, int connectedNumber, String consoleSerial) {
        this.brand = brand;
        this.connectedNumber = connectedNumber;
        this.consoleSerial = consoleSerial;
        this.color = GamepadColor.BLACK; // Default color
        this.chargeLevel = 100.0;
        this.isOn = false;
    }

    public ConsoleBrand getBrand() {
        return brand;
    }

    public String getConsoleSerial() {
        return consoleSerial;
    }

    public int getConnectedNumber() {
        return connectedNumber;
    }

    public GamepadColor getColor() {
        return color;
    }

    public double getChargeLevel() {
        return chargeLevel;
    }

    public boolean isOn() {
        return isOn;
    }

    public void decreaseChargeLevel(double amount) {
        chargeLevel -= amount;
    }

    @Override
    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Gamepad " + connectedNumber + " is powered on.");
        }
    }

    @Override
    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Gamepad " + connectedNumber + " is powered off.");
        }
    }
}
