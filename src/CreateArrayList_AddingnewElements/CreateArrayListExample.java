package CreateArrayList_AddingnewElements;
import java.util.ArrayList;
import java.util.List;

public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        System.out.println(animals);
    }

    public class CreateArrayListFromCollectionExample {

        public static void main(String[] args) {
            List<Integer> firstFivePrimeNumbers = new ArrayList<>();
            firstFivePrimeNumbers.add(2);
            firstFivePrimeNumbers.add(3);
            firstFivePrimeNumbers.add(5);
            firstFivePrimeNumbers.add(7);
            firstFivePrimeNumbers.add(11);

            // Creating an ArrayList from another collection
            List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

            List<Integer> nextFivePrimeNumbers = new ArrayList<>();
            nextFivePrimeNumbers.add(13);
            nextFivePrimeNumbers.add(17);
            nextFivePrimeNumbers.add(19);
            nextFivePrimeNumbers.add(23);
            nextFivePrimeNumbers.add(29);

            // Adding an entire collection to an ArrayList
            firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

            System.out.println(firstTenPrimeNumbers);
        }
    }

}
