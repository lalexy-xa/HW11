import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        HW a = new HW();

        List<String> l = Arrays.asList("1", "3", "5", "7");
        List<String> m = Arrays.asList("2", "4", "6");
        System.out.println(a.task1(l));
        System.out.println(a.task2(l));

        String[] mass = new String[]{"1, 2, 0", "4, 5", "3"};
        System.out.println(a.task3(mass));
//        a.task4(25214903917l, 11l, (long) Math.pow(2, 48) ).forEach(System.out::println);
        HW.zip(l.stream(), m.stream()).forEach(System.out::println);
    }
}