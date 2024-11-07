package OptionalPractice;

public class OptionalPractice {
    public static void main(String[] args) {

        String name = getName(2);
        System.out.println("My name is "+ name);
        System.out.println(name.toUpperCase());
    }
    public static String getName(int id){
        return "Amit";
    }
}
