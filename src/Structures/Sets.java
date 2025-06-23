package Structures;

import java.util.*;
import static java.util.EnumSet.complementOf;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Sets {
    public static void hashSetExample() {
        System.out.println("HashSet Example:");
        Set<Person> set = new HashSet<>();
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Jane", 22);
        Person p3 = new Person("Artem", 18);
        Person p4 = new Person("Artem", 19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.remove(p4);
        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.print(person.getName() + " ");
        }
        Person[] arr = set.toArray(new Person[0]);
        System.out.println("\n" + Arrays.toString(arr));
    }


    public static void treeSetExample() {
        System.out.println("\n\nTreeSet Example:");
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(86);
        tree.add(19);
        tree.add(7);
        tree.add(22);
        tree.add(48);
        System.out.println(tree);
        System.out.println(tree.first());
        System.out.println(tree.last());
        System.out.println(tree.lower(22));
        System.out.println(tree.floor(22));
        System.out.println(tree.ceiling(22));
        System.out.println(tree.higher(22));
        System.out.println(tree.subSet(19, 48));
        System.out.println(tree.headSet(48));
    }


    public static void linkedHashSetExample() {
        System.out.println("\n\nLinkedHashSet Example:");
        Set set = new LinkedHashSet();
        set.add(86);
        set.add(19);
        set.add(7);
        set.add(22);
        set.add(48);
        System.out.println(set);
    }


    public static void enumSetExample() {
        System.out.println("\n\nEnumSet Example:");
        EnumSet<Day> workDays = EnumSet.range(Day.MONDAY, Day.FRIDAY);
        // Создать множество из выходных (EnumSet.of(n1, n2, ...))
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        // Вывод
        System.out.println("Будние дни: " + workDays);
        System.out.println("Размер множества: " + workDays.size());

        // Объединение (EnumSet.copyOf(set))
        EnumSet<Day> allDays = EnumSet.copyOf(workDays);
        // Добавление остальных дней (set.addAll(set1))
        allDays.addAll(weekend);
        System.out.println("Вся неделя: " + allDays);

        EnumSet<Day> allDays2 = EnumSet.allOf(Day.class);
        System.out.println("Вся неделя (EnumSet.allOf(Structures.Day.class)): " + allDays2);

        // Пересечение (set.retainAll(set1))
        allDays.retainAll(weekend);
        System.out.println("Пересечение allDays и weekend: " + allDays);

        // Удаление подмножества (set.removeAll(set1))
        allDays.removeAll(weekend);
        // Удаление элемента (set.remove(element))
        allDays.remove(Day.FRIDAY);
        // Проверка наличия элемента (set.contains(element))
        System.out.println("Проверка наличия: " + allDays.contains(Day.FRIDAY));
        System.out.println("Будние дни без выходных: " + allDays);

        // Дополнение (EnumSet.complementOf(set))
        EnumSet<Day> notWeekend = complementOf(weekend); // Все дни кроме выходных
        System.out.println("Все дни кроме выходных: " + notWeekend);

        // Очистка (set.clear())
        allDays.clear();
        System.out.println("Пустое множество: " + allDays);
        System.out.println("Пустое ли множество? " + allDays.isEmpty());
    }
}
