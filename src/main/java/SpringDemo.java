import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpringDemo {


    static void stringWordCount(){

        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        Stream<String[]> temp = Arrays.stream(data);

        List<String> stringStream = temp.flatMap(x -> Arrays.stream(x)).collect(Collectors.toList());

        System.out.println("stringStream "+stringStream);
    }

    public static void main(String[] args) {
        stringWordCount();
    }
}
