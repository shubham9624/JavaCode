package JavaCode;

import java.util.*;
public class Return_KeyPad {
    public static String[] keypad(int n){
        // Write your code here
        String key[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> res=new ArrayList<String>();
        possibleWord(n,key,res,"");
        String word[]=new String[res.size()];
        for(int i=0;i<res.size();i++)
        {
          word[i]=res.get(i);
        }
        return word;
      
      
      }
      public static  void possibleWord(int n,String key[],ArrayList<String> res,String ans)
      {
        if(n==0)
        {
          res.add(ans);
          return;
        }
        int digit=n%10;
        String s=key[digit];
        for(int i=0;i<s.length();i++)
        {
          possibleWord(n/10, key, res, ans+s.charAt(i));
        }
      }
}
