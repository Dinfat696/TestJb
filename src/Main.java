import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static void main(String[] args) {
        int[] numbers = {1, 5, 1, 3, 1, 2};

        System.out.println(firstUnique(numbers));
    }

        public static Integer firstUnique ( int[] number){
            Set<Integer> input = new LinkedHashSet<>();
            Set<Integer> duplicates = new HashSet<>();
            for (int x : number) {
                if (!input.add(x)) {
                    duplicates.add(x);
                }
            }
            input.removeAll(duplicates);
            return input.isEmpty() ? null : input.iterator().next();

        }
    }












