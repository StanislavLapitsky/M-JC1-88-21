package edu.academy.jc.yarokhovich.hw8_9;

import java.util.HashSet;

public class TestUser {
    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        user1.setFirstName("John");
        user1.setLastName("Smith");
        user2.setFirstName("John");
        user2.setLastName("Smith");
        HashSet h = new HashSet();
        h.add(user1);
        h.add(user2);
        if (h.size() == 1){
            System.out.println("good job");
        }else {
            System.out.println("bad");
        }
    }
}
