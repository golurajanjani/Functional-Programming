import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String > names = List.of("Golu", "Raj", "Jay Shree Ram");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
