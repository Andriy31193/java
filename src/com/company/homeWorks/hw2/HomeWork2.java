package com.company.homeWorks.hw2;

import com.company.homeWorks.hw2.tasks.HW2T1;
import com.company.homeWorks.hw2.tasks.HW2T2;
import com.company.homeWorks.hw2.tasks.HW2T3;
import com.company.homeWorks.hw2.tasks.HW2T4;
import com.company.homeWorks.hw2.tasks.HW2T5;
import com.company.homeWorks.hw2.tasks.HW2T6;
import com.company.homeWorks.hw2.tasks.HW2T7;
import com.company.homeWorks.hw2.tasks.HW2T8;
import com.company.homeWorks.hw2.tasks.HW2T9;
import com.company.homeWorks.hw2.tasks.HW2T10;
import com.company.homeWorks.hw2.tasks.HW2T11;
import com.company.homeWorks.hw2.tasks.HW2T12;
import com.company.homeWorks.interfaces.IHW;
import com.company.homeWorks.interfaces.IManager;
import com.company.ui.UI;

import java.util.ArrayList;

public class HomeWork2 implements IHW, IManager {

    private ArrayList<IHW> _ihws = new ArrayList<IHW>();

    @Override
    public void solve() {
        setup();
    }
    @Override
    public void setup() {

        _ihws.add(new HW2T1());
        _ihws.add(new HW2T2());
        _ihws.add(new HW2T3());
        _ihws.add(new HW2T4());
        _ihws.add(new HW2T5());
        _ihws.add(new HW2T6());
        _ihws.add(new HW2T7());
        _ihws.add(new HW2T8());
        _ihws.add(new HW2T9());
        _ihws.add(new HW2T10());
        _ihws.add(new HW2T11());
        _ihws.add(new HW2T12());

        displayUI();
    }
    private void displayUI()
    {
        while (true) {
            UI.printBlock("This home work contains 12 sub-tasks, choose the task number: ");
            int stn = UI.readNumber()-1;

            if(stn < 0 || stn > _ihws.size() - 1)
                break;

            UI.printText("Result: ");
            _ihws.get(stn).solve();

            UI.printText("Back to home? (0/1) ");

            int result = UI.readNumber();

            if(result <= 0)
                break;
        }
    }
}
