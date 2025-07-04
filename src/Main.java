import Algorithms.SortAlgorithms;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Structures.Sets.java.hashSetExample();
//        Structures.Sets.java.treeSetExample();
//        Structures.Sets.java.linkedHashSetExample();
//        Structures.Sets.java.enumSetExample();

//        Structures.Lists.arrayListExample();
//        Structures.Lists.linkedListExample();

//        ArrayList<Structures.Person> persons = new ArrayList<>();
//        persons.add(new Structures.Person("Zack", 36));
//        persons.add(new Structures.Person("Artem", 27));
//        persons.add(new Structures.Person("Jack", 12));
//        persons.add(new Structures.Person("Martin", 24));
//
//        persons.sort(new Structures.PersonAgeComparator());
//        System.out.println(persons);
//
//        TreeSet<Structures.Person> treeSet = new TreeSet<>(persons);
//        System.out.println(treeSet);

//        Structures.Queues.ArrayBlockingQueueExample();
//        Structures.Queues.FIFODequeExample();
//        Structures.Maps.HashMapExample();
        int[] arr = {1, 54, -8, 0, 71, 12, 7, 6, 12, -3, 72};
        SortAlgorithms.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}