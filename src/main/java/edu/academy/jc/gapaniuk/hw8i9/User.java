package edu.academy.jc.gapaniuk.hw8i9;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String firstName;
    private String lastName;
    public User(String firstN, String lastN) {
        this.firstName = firstN;
        this.lastName = lastN;
    }

    public static void main(String[] args) {
        User u1 = new User("Sergey", "Gapa");
        User u2 = new User("Sergey", "Gapa");


        HashSet<User> hashUser = new HashSet<>();
        hashUser.add(u1);
        hashUser.add(u2);
        System.out.println(hashUser.size());

        Set<User> setUser = new HashSet<>();
        setUser.add(u1);
        setUser.add(u2);
        System.out.println(setUser.size());


        System.out.println(u1.equals(5));
        System.out.println(u1.hashCode() == u2.hashCode());

    }

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
        User u = null;
        try {
            u = (User) o;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
        if (!(this.lastName.equals(u.lastName))) {
            return false;
        } else {
            return this.firstName.equals(u.firstName);
        }

    }

    @Override
    public int hashCode() {
        int result1 = this.firstName == null ? 0 : this.firstName.hashCode();
        int result2 = this.lastName == null ? 0 : this.lastName.hashCode();
        return result1 + result2;
    }


}
