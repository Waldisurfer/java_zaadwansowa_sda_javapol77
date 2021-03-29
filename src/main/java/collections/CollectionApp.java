package collections;

import java.util.*;

public class CollectionApp {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        Set<String> set2 = Set.of("A", "B"); // immutable
        set.add("Example");
        set.add("Remove");
        System.out.println(set);
        set.remove("Example");
        System.out.println(set);
        set.add("Example");
        set.add("Example2");
        set.add("Example3");
        set.add("Example4");
        set.add("Example4");
        set.add("Example4");

        System.out.println(set.iterator().next());
        for (String text : set){
            System.out.println(text);
        }


        List<String> list = new ArrayList<>();
        List<String> list2 = List.of("A", "B"); // immutable
        list.add("Example");
        list.add("Example2");
        System.out.println(list);
        list.remove("Example");
        System.out.println(list);
        System.out.println(list.get(0));
        list.add("Example3");
        list.add("Example4");
        list.add("Example5");
        list.add("Example6");
        for (String imie : list) {
            System.out.println(imie);
        }

        Map<String, String> people = new HashMap<>();
        people.put("Karol", "programista");
        people.put("Ola", "socjolozka");
        for (String names : people.keySet()) {
            System.out.println(names);
        }
        for (String values : people.values()) {
            System.out.println(values);
        }




    }
}
