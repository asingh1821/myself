package OptionalPractice;

import java.util.Optional;

public class NullPointerException {
    public static void main(String[] args) {
        Optional<String> result = getName(2);
        System.out.println(result);
    }
    public static  Optional<String> getName(int id){
        String name = null;
        //return Optional.of(name);
        return Optional.ofNullable(name);

    }
}
