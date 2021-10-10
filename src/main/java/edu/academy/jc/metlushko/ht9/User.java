package edu.academy.jc.metlushko.ht9;

import java.util.*;

public class User {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        return o != null
                && this.getFirstName().equals(((User) o).getFirstName())
                && this.getLastName().equals(((User) o).getLastName());
    }

    @Override
    public int hashCode() {
        return this.getFirstName().hashCode() + this.getLastName().hashCode();
    }

    public static void main(String[] args) {
        User bob = new User();
        bob.setFirstName("Bob");
        bob.setLastName("Smith");

        User gleb = new User();
        gleb.setFirstName("Bob");
        gleb.setLastName("Smith");

        Set<User> hashSet = new HashSet<>();
        hashSet.add(bob);
        hashSet.add(gleb);

        System.out.println(hashSet.size());

    }

}
