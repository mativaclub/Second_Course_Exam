package Collections_List_Set_Map;

import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>
            (List.of("один", "один", "два", "два", "два", "три", "три", "три"));

    public static void task1() {
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void task2() {
        Collections.sort(nums);
        int prev = 0;
        for (Integer num : nums) {
            if (num % 2 == 0 && prev != num) {
                System.out.print(num + " ");
                prev = num;
            }
        }

    }

    public static void task3() {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);

    }

    public static void task4() {

        Map<String, Integer> countWords = new HashMap<>();
        for (String word : strings) {
            if (countWords.containsKey(word)) {
                countWords.put(word, countWords.get(word) + 1);
            } else {
                countWords.put(word, 1);
            }
        }
        System.out.println(countWords);


        Map<String, Integer> map = new HashMap<>();
        for (String word : strings) {
            if (!map.containsKey(word)) {
                map.put(word, 0);
            }
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            }
        }
        System.out.println(countWords);
    }



    public static void main(String[] args) {

        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        System.out.println();


    }
}