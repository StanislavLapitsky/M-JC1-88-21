package edu.academy.jc.likhina.hw8and9;


import java.util.HashSet;
import java.util.Set;


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
    public int hashCode() {
        return this.getFirstName().hashCode() + this.getLastName().hashCode();
    }

    @Override
    public boolean equals(Object user) {
        if (this == user)
            return true;
        if (user == null)
            return false;
        if (getClass() != user.getClass())
            return false;
        User other = (User) user;
        if (!firstName.equals(other.firstName))
            return false;
        if (!lastName.equals(other.lastName))
            return false;

        return true;
    }


    public static void main(String[] args) {

        User first = new User();
        first.setFirstName("John");
        first.setLastName("Smith");

        User second = new User();
        second.setFirstName("John");
        second.setLastName("Smith");


        Set<User> set = new HashSet<>();
        set.add(first);
        set.add(second);
        System.out.println(set.size());

    }


}
