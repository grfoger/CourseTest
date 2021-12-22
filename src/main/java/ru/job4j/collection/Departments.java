package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
           String[] strArray = value.split("/");
           String start = strArray[0];
           tmp.add(start);
           for (int i=1; i<strArray.length;i++){
               start = start +"/"+strArray[i];
               tmp.add(start);
           }
        }
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort((a1,a2)->new DepDescComp().compare(a1,a2));
    }
}