package Structures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Lists {
    public static void arrayListExample() {
        System.out.println("\n\nArrayList Example:");
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Jane", 22);
        Person p3 = new Person("Artem", 18);
        Person p4 = new Person("Artem", 18);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        System.out.println("Size of list: " + list.size());
        System.out.println("Contains p1? " + list.contains(p1));
        System.out.println("Index of p3: " + list.indexOf(p3));
        System.out.println("Get p2: " + list.get(1));
        System.out.println(list);
        System.out.println("Removed p3: " + list.remove(p3));
        System.out.println("Size of list: " + list.size());
        System.out.println("Contains p3? " + list.contains(p3));
        System.out.println("Contains p4? " + list.contains(p4));
        System.out.println("is empty? " + list.isEmpty());
    }

    public static void linkedListExample() {
        System.out.println("\n\nLinkedList Example:");
        LinkedList<Person> list = new LinkedList<>();
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Jane", 22);
        Person p3 = new Person("Artem", 18);
        Person p4 = new Person("Artem", 18);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.addFirst(p4);
        list.addLast(p1);
        System.out.println("Size of list: " + list.size());
        System.out.println("Contains p1? " + list.contains(p1));
        System.out.println("Index of p3: " + list.indexOf(p3));
        System.out.println("Get p2: " + list.get(1));
        System.out.println(list);
        System.out.println("Removed p3: " + list.remove(p3));
        System.out.println("Size of list: " + list.size());
        System.out.println("Contains p3? " + list.contains(p3));
        System.out.println("Contains p4? " + list.contains(p4));
        System.out.println("is empty? " + list.isEmpty());

        System.out.println("DescendingIterator:");
        Iterator<Person> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
