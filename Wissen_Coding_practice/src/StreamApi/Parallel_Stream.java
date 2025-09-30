package src.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Parallel_Stream {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Hemant","Rahul","Akshay","Amit","harshada");
        names.stream().parallel()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

/*
parallel Stream
        -Splits the data into chunks and processes in multiple threads using the Fork/Join framework.
        -it is not default.
        -Does not preserves order.
        -faster than Sequential stream.
        -Runs on multiple thread.
*/