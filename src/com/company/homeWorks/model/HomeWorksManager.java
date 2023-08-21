package com.company.homeWorks.model;
import java.util.ArrayList;

import com.company.homeWorks.interfaces.IHW;

import com.company.homeWorks.hw1.HomeWork1;
import com.company.homeWorks.hw2.HomeWork2;
import com.company.homeWorks.interfaces.IManager;
import com.company.ui.UI;


public class HomeWorksManager implements IManager {

    private ArrayList<IHW> _ihws = new ArrayList<IHW>();

    public HomeWorksManager() {
        setup();
    }
    @Override
    public void setup() {
        
        _ihws.add(new HomeWork1());
        _ihws.add(new HomeWork2());

        displayMenu();
    }
    private void displayMenu()
    {
        while(true) {

            UI.printBlock("Home Works that are available");

        for (int i = 0; i < _ihws.size(); i++) {
            UI.printText("Home Work " + (i + 1));
        }

            UI.printDelimiter();


            UI.printText("Select home work number: ");

            int hwn = UI.readNumber() - 1;

            if(hwn < 0 || hwn > _ihws.size() - 1)
                break;

            UI.printText("Here's result:");
            UI.printDelimiter('#');


            _ihws.get(hwn).solve();

            UI.printDelimiter('#');

            UI.printText("Back to home? (0/1) ");

            int result = UI.readNumber();

            if(result <= 0)
                break;
        }
    }
}
