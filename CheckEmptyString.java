import java.util.Arrays;
import java.util.List;

public class CheckEmptyString {
    public static void main(String[] args) {
        final List<String> strings = Arrays.asList("abc"," ","bc","efg","abcd"," ","jkl");
          strings.stream().filter(nonEmpty -> true).forEach(System.out::print);
    }
}
