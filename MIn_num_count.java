package JavaCode;

public class MIn_num_count {
    
    public static int minCount(int n) {
		//Your code goes here
		int dp[]=new int[n+1];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			dp[i]=i;
			for(int j=1;j*j<=i;j++)
			{
				dp[i]=Math.min(dp[i],1+dp[i-j*j]);
			}
		}
		return dp[n];
	}
}
