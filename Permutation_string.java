package JavaCode;

import java.util.ArrayList;

public class Permutation_string {
    public static String[] permutationOfString(String input){
  // Write your code here
  char ch[]=input.toCharArray();
  int fixedIndex=0;
  ArrayList<String> res=new ArrayList<String>();
  permutationOfStringHelper(ch,fixedIndex,res);
  String ret[]=new String[res.size()];
  for(int i=0;i<res.size();i++){
    ret[i]=res.get(i);
  }
  return ret;
}

private static void permutationOfStringHelper(char[] ch, int fixedIndex, ArrayList<String> res) {
  // TODO Auto-generated method stub
  if(fixedIndex >=ch.length-1)
  {
    res.add(new String(ch));
    return;
  }
  for(int i=fixedIndex; i<ch.length; i++)
  {
    swap(ch,i,fixedIndex);
    permutationOfStringHelper(ch, fixedIndex+1, res);
    swap(ch,i,fixedIndex);
  }
  
}

private static void swap(char[] ch, int i, int fixedIndex) {
  // TODO Auto-generated method stub
  char temp=ch[i];
  ch[i]=ch[fixedIndex];
  ch[fixedIndex]=temp;
}
}
