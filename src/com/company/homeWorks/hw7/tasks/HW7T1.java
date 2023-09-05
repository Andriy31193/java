package com.company.homeWorks.hw7.tasks;

import java.util.*;
import com.company.homeWorks.interfaces.IHW;

public class HW7T1 implements IHW {
    @Override
    public void solve() {
        // a. Create ArrayList<String> (list1)

        // b. Create an array of strings and add all elements to list1
        String[] array = {"Apple", "Banana", "Cherry"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(array));

        // c. Create a new ArrayList<String> (list2) initialized with list1
        ArrayList<String> list2 = new ArrayList<>(list1);

        // d. Create a list (list3) using Arrays.asList(...)
        List<String> list3 = Arrays.asList("Orange", "Grapes");

        // e. Insert list3 into the middle of list2
        int middleIndex = list2.size() / 2;
        list2.addAll(middleIndex, list3);

        // f. Sort the list in descending order
        list2.sort(Collections.reverseOrder());

        // g. *Delete every second element using list iterator
        ListIterator<String> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            if (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }

        // Print the modified list2
        System.out.println(list2);
    }
}
