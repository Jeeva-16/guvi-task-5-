import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilter {
    public static void main(String[] args) {
        // Step 1: Create a list of student names
        List<String> students = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Adam", "Eve", "Aiden");

        // Step 2: Use Stream API with lambda expression to filter names starting with "A"
        List<String> studentsWithA = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Step 3: Print the results
        System.out.println("Students whose names start with 'A': " + studentsWithA);
   }

}
