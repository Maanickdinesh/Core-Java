package corejava;

import java.util.Arrays;
import java.util.Comparator;

public class comparator {
    public static void main(String[] args) {
        String[] names = {"dinesh", "kumar", "karthick"};

        // Dynamic Binding
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                } else if (s1.length() < s2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        };

        // Sorting the array based on the comparator
        Arrays.sort(names, comp);

        // Print the sorted array
        System.out.println("Sorted based on string lengths:");
        for (String s : names) {
            System.out.println(s);
        }
    }
}
