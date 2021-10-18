package edu.academy.jc.bondarenko.cw9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
public class User {
    public String name;
    public Integer age;

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        User user=new User();
        String name;
        List<String> stringList=new ArrayList<>();
        for(int i=0; i<3; i++) {
            name=in.next();
            stringList.add(name);
        }
        Iterator<String> iterator= stringList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
