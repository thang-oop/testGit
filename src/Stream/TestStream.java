package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        List<String> result = Stream.of("bạn", "hãy", "like", "Fanpage", "loda","dể","cập","nhật","nhiều","hơn")
                .filter(s -> {
                    System.out.println("[filtering] " + s);
                    return s.length()>=4;
                })
                .map(s -> {
                    System.out.println("[mapping] " + s);
                    return s.toUpperCase();
                })
                .limit(5)
                .collect(Collectors.toList());
        System.out.println("----------------------");
        System.out.println("Result:");
        result.forEach(System.out::println);


        List<String> list = Arrays.asList("bạn", "hãy", "like", "Fanpage", "loda","dể","cập","nhật","nhiều","hơn");
        list.stream().filter(s -> {
            System.out.println("[filtering] " + s);
            return s.length()>=4;
        })
        .map(s -> {
            System.out.println("[mapping] " + s);
            return s.toUpperCase();
        })
        .limit(10)
        .collect(Collectors.toList());
        System.out.println("----------------------");
        System.out.println("Result:");
        result.forEach(System.out::println);
    }

}
