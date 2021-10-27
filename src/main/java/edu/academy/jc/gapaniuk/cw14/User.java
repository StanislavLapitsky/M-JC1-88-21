package edu.academy.jc.gapaniuk.cw14;

import java.util.ArrayList;
import java.util.List;

public class User {
    public static void main(String[] args) {

        List<User> ll = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            ll.add(new User());
        }
        SetUserName sun = (u) -> {
            u.setName(Integer.toString(u.hashCode()));


        };
        for (User iUser : ll) {
            sun.sn(iUser);
            System.out.println(iUser.hashCode());
        }
        System.out.println("---------------");
        ll.sort((u1, u2) ->  ((u1.hashCode() - u2.hashCode()) > 0) ? 1 : -1);

        for (User iUser : ll) {

            System.out.println(iUser.hashCode());
        }


    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
