package com.company.homeWorks.model;
import java.util.ArrayList;

import com.company.homeWorks.interfaces.IHW;

import com.company.homeWorks.hw1.HomeWork1;
import com.company.homeWorks.hw2.HomeWork2;
import com.company.homeWorks.hw3.HomeWork3;
import com.company.homeWorks.hw4.HomeWork4;
import com.company.homeWorks.hw5.HomeWork5;
import com.company.homeWorks.hw6.HomeWork6;
import com.company.homeWorks.hw7.HomeWork7;
import com.company.homeWorks.interfaces.IManager;
import com.company.ui.UI;


public class HomeWorksManager implements IManager {

    private ArrayList<IHW> _homeworks = new ArrayList<>();

    public HomeWorksManager() {
        setup();
    }

    @Override
    public void setup() {

        _homeworks.add(new HomeWork1());
        _homeworks.add(new HomeWork2());
        _homeworks.add(new HomeWork3());
        _homeworks.add(new HomeWork4());
        _homeworks.add(new HomeWork5());
        _homeworks.add(new HomeWork6());
        _homeworks.add(new HomeWork7());
        displayMenu();
    }
    private void displayMenu()
    {
        while(true) {

            UI.printBlock("Home Works that are available");

        for (int i = 0; i < _homeworks.size(); i++) {
            UI.printText("Home Work " + (i + 1));
        }

            UI.printDelimiter();


            UI.printText("Select home work number: ");

            int hwn = UI.readNumber() - 1;

            if(hwn < 0 || hwn > _homeworks.size() - 1)
                break;

            UI.printText("Here's result:");
            UI.printDelimiter('#');


            _homeworks.get(hwn).solve();

            UI.printDelimiter('#');

            UI.printText("Back to home? (0/1) ");

            int result = UI.readNumber();

            if(result <= 0)
                break;
        }
    }
}
