import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aBc","d","ef");
        Collectors collectors = null;
        List<String> UpperCaseString = strings.stream().map(String::toUpperCase).collect(collectors.toList());
        System.out.println(UpperCaseString);
    }
}
