package JavaCode;
import java.util.ArrayList;

public class Unique_subset {
    public static void printSubsets(int input[]) {
        printSubsetsHelper(input, 0, new ArrayList<>());
    }

    private static void printSubsetsHelper(int[] input, int index, ArrayList<Integer> subset) {
        // Add the current subset to the result
        printSubset(subset);

        // Explore all possible subsets with the current element
        for (int i = index; i < input.length; i++) {
            // Skip duplicate elements
            if (i > index && input[i] == input[i - 1]) {
                continue;
            }

            subset.add(input[i]);
            printSubsetsHelper(input, i + 1, subset);
            subset.remove(subset.size() - 1);
        }
    }

    private static void printSubset(ArrayList<Integer> subset) {
        for (int num : subset) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
