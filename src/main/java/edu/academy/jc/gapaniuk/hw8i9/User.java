package edu.academy.jc.gapaniuk.hw8i9;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class User {
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



        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode()==u2.hashCode());

    }

    private String firstName;
    private String lastName;

    public User(String firstN, String lastN) {
        this.firstName = firstN;
        this.lastName = lastN;
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

    public boolean equals(User u) {

        if (!(this.lastName == u.lastName)) {
            return false;
        } else {
            return this.firstName == u.firstName;
        }

    }
    public int hashCode(){
        int result1 =this.firstName == null ? 0 : this.firstName.hashCode();
        int result2 =this.lastName == null ? 0 : this.lastName.hashCode();
        return result1+result2;
    }


}
