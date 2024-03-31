package com.dts.core.features.streams;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] as) {
        List<String> s1=new ArrayList<>();
        s1.add("java1");
        s1.add("python1");
        List<String> s = Arrays.asList("sd","sf","wer","java","python","sql","operator","mule","sales");
        System.out.println(s.containsAll(s1));

        System.out.println(s.stream().count());

        System.out.println(s.stream().findFirst());
        System.out.println(s.stream().findAny());

        System.out.println(s.stream().map(i->i=="sql").collect(Collectors.toList()));
        System.out.println(s.stream().map(i->i=="sql").filter(b -> b.equals(true)).collect(Collectors.toList()));
        System.out.println(s.stream().map(i->i=="sql").filter(b -> b.equals(true)).collect(Collectors.toList()));

        System.out.println(System.lineSeparator());
        System.out.println(System.lineSeparator());

        Random random = new Random();
        random.ints().limit(5).sorted().forEach(System.out::println);

        System.out.println(System.lineSeparator());
        System.out.println(System.lineSeparator());
        System.out.println("------------------------------");
        Random random1 = new Random();
        random1.ints().limit(5).filter((s3->s3>0)).forEach(System.out::println);

        System.out.println(System.lineSeparator());
        System.out.println(System.lineSeparator());

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
        List<Integer> squaresListAll = numbers.stream().map( i -> i*i).collect(Collectors.toList());
        System.out.println(squaresListAll);

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        Long count = strings.stream().filter(sr -> !sr.isEmpty()).count();
        System.out.println(count);

        System.out.println(System.lineSeparator());
        System.out.println(System.lineSeparator());
        Instant start = Instant.now();
        Random random11 = new Random();
        Random random22 = new Random();
        System.out.println("------------------------------");
        random11.ints().limit(10000).forEach(System.out::println);
        System.out.println("------------------------------ Time Took in MS: " + Duration.between(start, Instant.now()));
        System.out.println(System.lineSeparator());
        System.out.println(System.lineSeparator());
        System.out.println("------------------------------");
        random22.ints().limit(10000).forEach(System.out::println);
        System.out.println("------------------------------ Time Took in MS: " + Duration.between(start, Instant.now()));


        List<String> strings123 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings123.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);
        String mergedString = strings123.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(",   "));
        System.out.println("Merged String: " + mergedString);




        List numbers2222 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers2222.stream().mapToInt((x) -> (int) x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

        // map
        List<String> collected = Stream.of("a", "b", "hello").map(String::toUpperCase).collect(Collectors.toList());
        List<String> collected1 = Arrays.asList("a", "b", "hello").stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Map operation on streams");
        System.out.println(collected);
        System.out.println(collected1);
        // Flat Map
        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4)).flatMap(List::stream).map(integer -> integer + 1).collect(Collectors.toList());
        System.out.println(together);
    }

}
