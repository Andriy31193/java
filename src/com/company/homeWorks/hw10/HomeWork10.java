package com.company.homeWorks.hw10;
import com.company.homeWorks.aclasses.MultipleHomework;
import com.company.homeWorks.hw10.models.Car;
import com.company.homeWorks.hw10.models.Dispatcher;
import com.company.homeWorks.hw10.models.Driver;
import com.company.homeWorks.hw9.tasks.*;
import com.company.homeWorks.interfaces.IHW;

import java.util.List;
import java.util.Map;

public class HomeWork10 implements IHW {
    @Override
    public void solve() {
        setup();
    }

    public void setup()
    {
        // Create a dispatcher
        Dispatcher dispatcher = new Dispatcher();

        // Add drivers and cars to the dispatcher
        dispatcher.addDriver(new Driver("Driver1", 5, new Car("Car1", 10)));
        dispatcher.addDriver(new Driver("Driver2", 3, new Car("Car2", 8)));
        dispatcher.addCar(new Car("Car1", 10));
        dispatcher.addCar(new Car("Car2", 8));

        // Process random requests
        dispatcher.processRequests(5); // Process 5 random requests

        // Print cargo statistics
        System.out.println("Cargo Statistics:");
        for (Map.Entry<String, Integer> entry : dispatcher.getCargoStatistics().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Print  drivers with the highest earnings
        List<Driver> topDrivers = dispatcher.getDriversWithHighestEarnings();
        System.out.println("Drivers with Highest Earnings:");
        for (Driver driver : topDrivers) {
            System.out.println(driver.getName() + ": $" + driver.getEarnings());
        }
        System.out.println("lOG File has been created as trip_log.txt in root directory.");
    }
}
