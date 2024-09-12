package org.example;

import java.util.List;

public class ListComparator {
    public static String compareAverages(List<Integer> list1, List<Integer> list2) {
        double avg1 = calculateAverage(list1);
        double avg2 = calculateAverage(list2);

        if (avg1 > avg2) {
            return "Первый список имеет большее среднее значение";
        } else if (avg2 > avg1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    private static double calculateAverage(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int sum = 0;
        for (int num : list) {
            sum += num;
        }

        return (double) sum / list.size();
    }
}
