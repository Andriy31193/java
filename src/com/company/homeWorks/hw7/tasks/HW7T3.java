package com.company.homeWorks.hw7.tasks;
import java.util.*;
import com.company.homeWorks.interfaces.IHW;

public class HW7T3 implements IHW {
    @Override
    public void solve()  {
        // a. Create LinkedHashMap<Integer, String> (map1)
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();

        // b. Add values of all months of the year to map1
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");

        // c. Print the first and last month of the year
        System.out.println("First month: " + map1.get(0));
        System.out.println("Last month: " + map1.get(11));

        // d. Insert "ОТПУСК" as the value for the 6th month and print map1
        map1.put(6, "VACATIONS");
        System.out.println(map1);

        // e. Create HashMap<Integer, String> (map2)

        // f. Insert all values from map1 into map2
        HashMap<Integer, String> map2 = new HashMap<>(map1);

        // g. *Create a method to print all elements of a map
        printMap(map1);
        printMap(map2);
    }

    // Method to print all elements of a map
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}