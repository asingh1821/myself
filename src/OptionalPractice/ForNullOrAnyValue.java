package OptionalPractice;

import java.util.Optional;

public class ForNullOrAnyValue {
    public static void main(String[] args) {
       Optional<String> result = getName(2);
      // String nameUsed = result.isPresent() ? result.get():"Default Name";
        String nameUsed = result.orElse("Default Name");
        System.out.println(nameUsed);
    }
    public static Optional<String> getName(int id){
        return Optional.empty();
    }
}
