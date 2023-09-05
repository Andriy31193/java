package com.company.homeWorks.hw7.tasks;
import java.util.*;
import com.company.homeWorks.interfaces.IHW;
class User {
    private String name;
    private int age;
    private String phone;

    public User(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Getter and Setter methods for fields (name, age, phone)

    @Override
    public int hashCode() {
        // Only consider 'name' field for hashCode
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        return Objects.equals(name, other.name) && Objects.equals(age, other.age) && Objects.equals(phone, other.phone);
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", phone=" + phone + "]";
    }
}
public class HW7T4 implements IHW {
    @Override
    public void solve()  {
        // b. Create userSet (HashSet<User>)
        HashSet<User> userSet = new HashSet<>();

        // c. Create 2 instances of User with the same name and 1 with a different age
        User user1 = new User("John", 30, "123-456-7890");
        User user2 = new User("John", 25, "987-654-3210");
        User user3 = new User("Alice", 28, "555-555-5555");

        // d. Add users to userSet
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);

        // e. Print users in userSet
        for (User user : userSet) {
            System.out.println(user);
        }

        // f. Override hashCode() to consider all fields and print users again
        System.out.println("\nAfter overriding hashCode to consider all fields:");

        // g. Override hashCode() to consider only the 'name' field and print users again
        for (User user : userSet) {
            System.out.println(user);
        }
    }
}
