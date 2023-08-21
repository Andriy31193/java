package com.company.homeWorks.hw2;

import com.company.homeWorks.hw2.tasks.*;
import com.company.homeWorks.interfaces.IHW;
import com.company.homeWorks.aclasses.MultipleHomework;

public class HomeWork2 extends MultipleHomework implements IHW {

    @Override
    public void solve() {
        setup();
    }

    public void setup() {

        _homeworks.add(new HW2T1());
        _homeworks.add(new HW2T2());
        _homeworks.add(new HW2T3());
        _homeworks.add(new HW2T4());
        _homeworks.add(new HW2T5());
        _homeworks.add(new HW2T6());
        _homeworks.add(new HW2T7());
        _homeworks.add(new HW2T8());
        _homeworks.add(new HW2T9());
        _homeworks.add(new HW2T10());
        _homeworks.add(new HW2T11());
        _homeworks.add(new HW2T12());

        super.display();
    }
}
