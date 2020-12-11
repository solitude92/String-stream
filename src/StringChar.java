import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringChar {
    public static void main(String[] args) {
        String[] array = {"Absolutely", "Hi", "Hello", "Howdy Buddy", "Fine", "RightThings"};

        System.out.println(Arrays.stream(array). collect(Collectors.groupingBy(String::length )));
        System.out.println(Arrays.stream(array). collect(Collectors.groupingBy(String::length, Collectors.counting())));


    }
}
