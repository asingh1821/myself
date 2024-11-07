package OptionalPractice;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional<String> result = getName(2);
        if(result.isPresent()){     // This will check if any value is +nt or not.
            System.out.println(result.get());
        }
        result.ifPresent(x->System.out.println(x));//This will check if value is +nt then print
        result.ifPresent(System.out::println);// Here i used same but with method reference.
    }
    public static Optional<String>  getName(int id){
        String name = "Amit Singh";
        return Optional.of(name);
    }
}
