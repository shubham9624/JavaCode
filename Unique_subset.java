package JavaCode;
import java.util.ArrayList;

public class Unique_subset {
    public static void printSubsets(int input[]) {
  // Write your code here
  printSubsetsHelper(input,0,new ArrayList<Integer>());
}

private static void printSubsetsHelper(int[] input, int index, ArrayList<Integer> arrayList) {
  // TODO Auto-generated method stub
  if(index >= input.length)
  {
    for(int i:arrayList)
    {
      System.out.print(i+" ");
    }
    System.out.println();
    return;
  }
  while(index+1 < input.length && input[index+1] == input[index])
  {
    index+=1;
  }
  printSubsetsHelper(input,index+1,arrayList);
  arrayList.add(input[index]);
  printSubsetsHelper(input,index+1,arrayList);
  arrayList.remove(arrayList.size()-1);
}
}
