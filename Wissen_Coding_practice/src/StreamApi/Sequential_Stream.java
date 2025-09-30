package src.StreamApi;

import java.util.Arrays;
import java.util.List;

public class Sequential_Stream {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Hemant","Rahul","Akshay","Amit");
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

/*
Sequential Stream
        -it is default.
        -preserves order.
        -one by one process data.
        -slower than parallel stream.
        -Runs on Single thread.
*/
