package main.lessons.lesson3.string.equals_and_hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat(1, "Barsik");
        Cat cat2 = new Cat(1, "Barsiq");

//        System.out.println(cat1 == cat2);
//        System.out.println(cat1.equals(cat2));

        Set<Cat> hashSet = new HashSet<>();
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        hashSet.add(cat1);
        hashSet.add(cat2);
        System.out.println(hashSet);

//        Object obj;
//        Set<String> hashSet2 = new HashSet<>();
//        String str1 = new String("str1");
//        String str2 = new String("str1");
//        System.out.println("str1: " + str1.hashCode());
//        System.out.println("str2: " + str2.hashCode());
//        hashSet.add(str1);
//        hashSet.add(str2);
//        System.out.println(hashSet);
    }

}
