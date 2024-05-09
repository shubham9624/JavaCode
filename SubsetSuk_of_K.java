package JavaCode;

import java.util.ArrayList;

public class SubsetSuk_of_K {
    public static int[][] subsetsSumK(int input[], int k) {
  // Write your code here
  ArrayList<ArrayList<Integer>> res = new ArrayList<>();
      subsetSumKhelper(input, k, res, new ArrayList<>(), 0);
      
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
private static void subsetSumKhelper(int[] input, int k, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> current, int index) {
      if (k == 0) {
          res.add(new ArrayList<>(current));
          return;
      }
      if (index >= input.length) {
          return;
      }
      // Exclude the current element
      subsetSumKhelper(input, k, res, current, index + 1);

      // Include the current element
      if (k - input[index] >= 0) {
          current.add(input[index]);
          subsetSumKhelper(input, k - input[index], res, current, index + 1);
          current.remove(current.size() - 1);
      }
  }
}
