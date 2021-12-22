package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {

        String[] part1 = o1.split("/");
        String[] part2 = o2.split("/");
        if(part1.length != part2.length) return part1.length - part2.length;
        if(!part1[0].equals(part2[0])) {
            char[] ch1 = part1[0].toCharArray();
            char[] ch2 = part2[0].toCharArray();
            for (int i=0;i < ch1.length && i < ch2.length;i++) {
                if (ch1[i] == ch2[i]) continue;
                else return ch2[i] - ch1[i];
            }
        }
        for (int i =1; i <part1.length && i <part2.length;i++){
                char[] ch1 = part1[i].toCharArray();
                char[] ch2 = part2[i].toCharArray();
                for (int j=0;j < ch1.length && j < ch2.length;j++) {
                    if (ch1[j] == ch2[j]) continue;
                    return ch1[j]-ch2[j];
                }
        }
        return 0;
    }
}