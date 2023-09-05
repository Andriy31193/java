package com.company.homeWorks.hw7;

import com.company.homeWorks.aclasses.MultipleHomework;
import com.company.homeWorks.hw7.tasks.*;
import com.company.homeWorks.interfaces.IHW;

public class HomeWork7 extends MultipleHomework implements IHW {

    @Override
    public void solve() {
        setup();
    }

    public void setup()
    {
        _homeworks.add(new HW7T1());
        _homeworks.add(new HW7T2());
        _homeworks.add(new HW7T3());
        _homeworks.add(new HW7T4());

        super.display();
    }
}
