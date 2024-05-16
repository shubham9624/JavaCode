package JavaCode;

public class Byte Landian {
    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here
		  if (n == 0) return 0;
    if (memo.containsKey(n)) 
	return memo.get(n);
    
    long amount = Math.max(n, bytelandian(n / 2, memo) + bytelandian(n / 3, memo) + bytelandian(n / 4, memo));
    memo.put(n, amount);
    
    return amount;

	}
}
