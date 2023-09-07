import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HW {
    public String task1(List<String> name){
        return name
                .stream()
                .filter(n -> name.indexOf(n)%2 != 0)
                .map(n -> name.indexOf(n) + ". " + n)
                .collect(Collectors.joining(", "));
    }

    public List<String> task2(List<String> str){
        return str
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public String  task3(String[] numbers){
        return Arrays.asList(numbers)
                .stream()
                .map(a -> Arrays.asList(a.split(", ")))
                .flatMap(a -> a.stream())
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public Stream<Long> task4(Long a, Long c, Long m){
        Stream<Long> iterate = Stream.iterate((long)1, i -> Math.abs((a*i + c)%m));
        return iterate;
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> f = first.collect(Collectors.toList());
        List<T> s = second.collect(Collectors.toList());

        return Stream.iterate(0, x -> x < Math.min(f.size(), s.size()), x -> x + 1)
                .map(a -> Arrays.asList(f.get(a), s.get(a)))
                .flatMap(b -> b.stream());
    }
}
