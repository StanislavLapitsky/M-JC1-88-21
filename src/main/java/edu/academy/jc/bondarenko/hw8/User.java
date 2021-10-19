package edu.academy.jc.bondarenko.hw8;

import java.util.HashSet;
import java.util.Set;

public class User {
    private String firstName;
    private String lastName;

    public User(){}

    public User(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
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
    public boolean equals(java.lang.Object u) {
        if(this==u)
            return true;
        if(u==null || getClass()!=u.getClass())
            return false;
        if (this.firstName == ((User) u).firstName)
            if (this.lastName == ((User) u).lastName)
                return true;
            else return false;
        else return false;
    }
@Override
    public int hashCode() {
        int res=0;
        if(firstName!=null)
            res+=firstName.hashCode();
        else if(lastName!=null)
            res+=lastName.hashCode();
        return res;
    }


    public static void main(String[]args){
        User u1=new User("John","Smith");
        User u2=new User("John","Smith");

        HashSet<User> hashSet=new HashSet<>();
        hashSet.add(u1);
        hashSet.add(u2);

        System.out.println("Hash size: "+ hashSet.size());

        Set<User> set=new HashSet<>();
        set.add(u1);
        set.add(u2);

        System.out.println("Set size "+ set.size());


        System.out.println("Equal method: "+u1.equals(u2));
        System.out.println("Hash code meth: ");
        System.out.println(u1.hashCode()==u2.hashCode());
    }
}
