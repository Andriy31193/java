package com.company.homeWorks.aclasses;

import com.company.homeWorks.interfaces.IHW;
import com.company.ui.UI;

import java.util.ArrayList;

public abstract class MultipleHomework
{
    protected ArrayList<IHW> _homeworks = new ArrayList<IHW>();

    public void display() {
        while (true) {
            UI.printBlock("Homework contains " + _homeworks.size() + " sub-tasks. Input task number: ");
            int stn = UI.readNumber()-1;

            if(stn < 0 || stn > _homeworks.size() - 1)
                break;

            UI.printText("Result: ");
            _homeworks.get(stn).solve();

            UI.printText("Back to home? (0/1) ");

            int result = UI.readNumber();

            if(result <= 0)
                break;
        }
    }
}
