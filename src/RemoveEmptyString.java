import java.util.Arrays;
import java.util.Objects;

public class RemoveEmptyString {
    public static void main(String[] args) {
        String[] input = { "java", "", " ", null, "stream", "", "are", "" };

        String[] array = Arrays.stream(input)
                .filter(Objects::nonNull)
                .filter(s ->!s.isBlank())
                .toArray(String[]::new);

        System.out.println(Arrays.toString(array));
    }

}
