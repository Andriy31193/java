package com.company.homeWorks.hw7.tasks;
import java.util.*;
import com.company.homeWorks.interfaces.IHW;

public class HW7T2 implements IHW {
    @Override
    public void solve() {
        // a. Create HashSet<String> (set1)
        HashSet<String> set1 = new HashSet<>();

        // b. Insert 2 arbitrary strings into set1
        set1.add("Dog");
        set1.add("Cat");

        // c. Insert all elements from list1 and list2 into set1
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Orange", "Grapes"));
        set1.addAll(list1);
        set1.addAll(list2);

        // d. Print the values of set1
        System.out.println(set1);

        // e. Create LinkedHashSet<String> (set2)
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        // f. Insert all elements from list2 and list3 into set2
        set2.addAll(list1);
        set2.addAll(list2);

        // g. Print the values of set2
        System.out.println(set2);
    }
}