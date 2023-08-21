package com.company.homeWorks.hw3;

import com.company.homeWorks.hw3.tasks.*;
import com.company.homeWorks.interfaces.IHW;
import com.company.homeWorks.aclasses.MultipleHomework;

public class HomeWork3 extends MultipleHomework implements IHW {

    @Override
    public void solve() {
        setup();
    }

    public void setup()
    {
        _homeworks.add(new HW3T1());
        _homeworks.add(new HW3T2());
        _homeworks.add(new HW3T3());
        _homeworks.add(new HW3T4());

        super.display();
    }
}