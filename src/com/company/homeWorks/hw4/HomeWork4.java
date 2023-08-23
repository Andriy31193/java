package com.company.homeWorks.hw4;

import com.company.homeWorks.hw4.tasks.*;
import com.company.homeWorks.interfaces.IHW;
import com.company.homeWorks.aclasses.MultipleHomework;

public class HomeWork4 extends MultipleHomework implements IHW {

    @Override
    public void solve() {
        setup();
    }

    public void setup()
    {
        _homeworks.add(new HW4T1());
        _homeworks.add(new HW4T2());
        _homeworks.add(new HW4T3());
        _homeworks.add(new HW4T4());
        _homeworks.add(new HW4T5());
        _homeworks.add(new HW4T6());

        super.display();
    }
}