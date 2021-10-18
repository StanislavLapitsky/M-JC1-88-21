package edu.academy.jc.bondarenko.cw9;
import java.util.*;

public class ClassWork {
    public static void main(String[] args){
        Random random=new Random();
        ClassWork cw=new ClassWork();
        List<Integer> arrListOrig=new ArrayList<>();
        for(int i=0; i<20; i++)
            arrListOrig.add(random.nextInt(20));

        List<Integer>arrListCopy=new ArrayList<>();
        for(int i=0; i<arrListOrig.size(); i++) {
            if (arrListOrig.get(i) % 2 != 0) {
                arrListCopy.add(arrListOrig.get(i));
            }
        }

        Iterator<Integer> integerIterator= arrListCopy.iterator();
        while(integerIterator.hasNext()) {
            System.out.print(integerIterator.next()+ " ");
        }

        Set<Integer> set=new HashSet<>(arrListCopy);

        System.out.println();

        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }

    }
}
