package Structures;

import java.util.HashMap;

public class Maps {
    public static void HashMapExample() {
        HashMap<String, Person> hashMap = new HashMap<>();
        hashMap.put("first", new Person("Artem", 18));
        hashMap.put("second", new Person("Bob", 19));
        hashMap.put("third", new Person("Martin", 20));
        hashMap.put("fourth", new Person("Zack", 21));
        System.out.println(hashMap);
    }
}
