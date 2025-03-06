package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {

	public static void main(String[] args) {
		
        /*Important notes*/                                               //intermediate-filter, map, limit(3)->first 3 element, sorted()
/* 1. we cam use as many intermediate operation as we want                
* 2. but we can only use one termination operation                        //termination- forEach, Collectors
* 3.once the termination done then we cant use that stream
* 4.intermediate operation work simultaneously
*/

		
//example one
		
		List< Integer> list=List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12);
		Stream<Integer> stream=list.stream();
		
		stream	
			  .filter((x)->{         //filter : one of the intermediate operation
				  return x % 2==0;
				  })
			  .filter((x)->{
				  return x%3 ==0;
			  })
			  .forEach((x)->{        //forEach :one of the termination operation
				  System.out.println(x);
				  });
		
		
//example 2
        List<Integer> numbers = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);

        List<Integer> result = numbers.stream()
                .filter(n -> n > 30)  // Keep numbers greater than 30
                .map(n -> n * 2)  // Multiply each by 2
                .sorted()  // Sort in ascending order
                .limit(3)  // Take the first 3 elements
                .collect(Collectors.toList()); // Collect to a list

        System.out.println(result); // Output: [80, 100, 120]
	}
}
