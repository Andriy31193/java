package com.company.homeWorks.hw5;

import com.company.homeWorks.hw5.models.House;
import com.company.homeWorks.hw5.models.ResidentialHouse;
import com.company.homeWorks.hw5.models.School;
import com.company.homeWorks.hw5.models.Shop;
import com.company.homeWorks.interfaces.IHW;

public class HomeWork5 implements IHW {

    @Override
    public void solve() {
        House[] houses = new House[3];
        houses[0] = new ResidentialHouse("123 Main St.");
        houses[1] = new Shop("456 Market St.");
        houses[2] = new School("789 School St.");

        String[] inputDetails = {
                "5",
                "Grocery Store",
                "200,High School"
        };

        for (int i = 0; i < houses.length; i++) {
            houses[i].setDetailsFromInput(inputDetails[i]);
            houses[i].displayInfo();
            System.out.println();
        }
    }
}
