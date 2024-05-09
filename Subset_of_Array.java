package JavaCode;

import java.util.ArrayList;

public class Subset_of_Array {
     public static int[][] subsets(int input[]) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        subsetsHelper(input, res, new ArrayList<>(), 0);
        
        int[][] result = new int[res.size()][];
        for (int i = 0; i < res.size(); i++) {
            ArrayList<Integer> subset = res.get(i);
            result[i] = new int[subset.size()];
            for (int j = 0; j < subset.size(); j++) {
                result[i][j] = subset.get(j);
            }
        }
        return result;
    }

    private static void subsetsHelper(int[] input, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> current, int index) {
        if (index == input.length) {
            res.add(new ArrayList<>(current));
            return;
        }
        // Exclude the current element
        subsetsHelper(input, res, current, index + 1);
        // Include the current element
        current.add(input[index]);
        subsetsHelper(input, res, current, index + 1);
        // Backtrack: remove the last added element to explore other possibilities
        current.remove(current.size() - 1);
    }
}
