import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {

        List<String> names=Arrays.asList("Alice","Bob","Ankit","Stev");

        //Predicate
        Predicate<String> startsWithA= name -> name.startsWith("A");
        System.out.println("Names starting with A:");
        names.stream().filter(startsWithA).forEach(System.out::println);

        //Function
        Function<String,Integer> nameLength=name->name.length();
        System.out.println("\nLength of each name: ");
        names.stream().map(nameLength).forEach(System.out::println);

        //Supplier
        Supplier<String> greetSupply =()->"Hello From Supplier";
        System.out.println("\nSupplier says: "+greetSupply.get());

        Consumer<String> printName = name -> System.out.println("Processing : " + name);
        System.out.println("\n=using Consumer to process names: ");
        names.forEach(printName);

    }
}
