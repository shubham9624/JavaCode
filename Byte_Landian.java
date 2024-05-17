package JavaCode;
import java.util.*;
public class Byte_Landian {

   public static long bytelandian(long n, Map<Long, Long> memo) {
        if (n == 0) return 0;
        if (memo.containsKey(n)) return memo.get(n);

        long amount = Math.max(n, bytelandian(n / 2, memo) + bytelandian(n / 3, memo) + bytelandian(n / 4, memo));
        memo.put(n, amount);

        return amount;
    }
}
