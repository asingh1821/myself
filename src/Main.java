import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,3,5,7,21,54);
       long thirdHighestNumber = list.stream()
               .sorted((i1,i2)-> i2.compareTo(i1))
               .skip(2)
               .findFirst()
               .orElse(null);
       System.out.println(thirdHighestNumber);
    }
}