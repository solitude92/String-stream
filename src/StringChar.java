import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringChar {
    public static void main(String[] args) {
        String[] array = {"Absolutely", "Hi", "Hello", "Howdy Buddy", "Fine", "RightThings"};
        System.out.println(Arrays.stream(array).collect(Collectors.groupingBy(String::length)));
    }
}
