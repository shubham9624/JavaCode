package JavaCode;

public class Loot_house {
    public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
        int dp[]=new int[houses.length];
        dp[0]=houses[0];
        for(int i=1;i<houses.length;i++)
        {
            int inc=dp[i-2]+houses[i];
            int exc=dp[i-1];

            dp[i]=Math.max(inc,exc);

        }
        return dp[houses.length-1];
	}

}
