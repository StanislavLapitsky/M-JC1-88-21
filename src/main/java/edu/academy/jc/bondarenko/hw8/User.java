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

    public boolean equalsMeth(User u) {
        if(this==u)
            return true;
        if(u==null || getClass()!=u.getClass())
            return false;
        if (this.firstName == u.firstName)
            if (this.lastName == u.lastName)
                return true;
            else return false;
        else return false;
    }

    public int hashCodeMeth() {
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
        //u1.setFirstName("John");
        //u1.setLastName("Smith");

        //u2.setFirstName("John");
        //u2.setLastName("Smith");

        HashSet<User> hashSet=new HashSet<>();
        hashSet.add(u1);
        hashSet.add(u2);

        System.out.println("Hash size: "+ hashSet.size());

        Set<User> set=new HashSet<>();
        set.add(u1);
        set.add(u2);

        System.out.println("Set size "+ set.size());


        System.out.println("Equal method: "+u1.equalsMeth(u2));
        System.out.println("Hash code meth: ");
        System.out.println(u1.hashCodeMeth()==u2.hashCodeMeth());
    }
}
