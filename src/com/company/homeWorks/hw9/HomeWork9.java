package com.company.homeWorks.hw9;
import com.company.homeWorks.aclasses.MultipleHomework;
import com.company.homeWorks.hw9.tasks.*;
import com.company.homeWorks.interfaces.IHW;

public class HomeWork9 extends MultipleHomework implements IHW {
    @Override
    public void solve() {
        setup();
    }

    public void setup()
    {
        _homeworks.add(new HW9T1());
        _homeworks.add(new HW9T2());
        _homeworks.add(new HW9T3());

        super.display();
    }
}
