import org.example.ListComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ListComparatorTest {
    @Test
    void testCompareAverages_FirstListHasHigherAverage() {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(5, 10, 15);

        String result = ListComparator.compareAverages(list1, list2);
        Assertions.assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    void testCompareAverages_SecondListHasHigherAverage() {
        List<Integer> list1 = Arrays.asList(5, 10, 15);
        List<Integer> list2 = Arrays.asList(10, 20, 30);

        String result = ListComparator.compareAverages(list1, list2);
        Assertions.assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    void testCompareAverages_AveragesAreEqual() {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(15, 25, 20);

        String result = ListComparator.compareAverages(list1, list2);
        Assertions.assertEquals("Средние значения равны", result);
    }

    @Test
    void testCompareAverages_EmptyLists() {
        List<Integer> list1 = Arrays.asList();
        List<Integer> list2 = Arrays.asList();

        String result = ListComparator.compareAverages(list1, list2);
        Assertions.assertEquals("Средние значения равны", result);
    }
}
