import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> lines = Arrays.asList("Spring boot","Thang","Test");

        List<String> resulyt = lines.stream()
                .filter(line-> !"Thang".equals(line))
                .collect(Collectors.toList());

        resulyt.forEach(System.out::println);
    }
}
