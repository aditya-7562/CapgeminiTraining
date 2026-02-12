import java.util.Arrays;
import java.util.List;

public class StreamsP2 {
    public static void main(String[] args) {
        List<students> studentList = Arrays.asList(
                new students("Ashish", 90),
                new students("Ramesh", 80),
                new students("Mihir", 88),
                new students("Rajesh", 70));

        studentList.stream().filter(st -> st.marks > 80).forEach(st -> System.out.println(st.name));
    }
}

class students {
    String name;
    int marks;

    students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    
}