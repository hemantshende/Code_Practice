package src.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_Even_Square {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 7, 4, 6);

        List<Integer> result=numbers.stream()
                .filter(n->n%2==0)
                .map(n->n*n)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result); // Output: [4, 16, 36, 64]
    }
}
