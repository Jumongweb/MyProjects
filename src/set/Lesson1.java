package set;

import java.util.*;

public class Lesson1 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Jumong");
        names.add("Sultan");
        names.add("Prince");
        names.add("King");
        names.add("Queen");
        //System.out.println(names);

        names.forEach(System.out::println);
        System.out.println(names.contains("cat"));
        System.out.println(names.contains("Sultan"));
        names.remove("Prince");

        System.out.println(names);
        System.out.println();
        System.out.println("Iterator------------");

        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(2);
        numberList.add(1);
        System.out.println(numberList);
        Set<Integer> numberSet = new HashSet<>(numberList);
        System.out.println(numberSet);

        Set<String> nameTree = new TreeSet<>(names);
        nameTree.forEach(System.out::println);
        System.out.println(nameTree);

    }
}
