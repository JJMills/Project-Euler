package solutions;

import framework.Problem;
import framework.ProblemInfo;

import java.math.BigInteger;

@ProblemInfo(
        description = "1000-digit Fibonacci number",
        number = 25
)
public class Problem025 extends Problem {
    @Override
    public Object solve() {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;
        BigInteger limit = BigInteger.TEN.pow(999);
        int count = 0;
        while (b.compareTo(limit) != 1) {
            BigInteger temp = b.add(a);
            a = b;
            b = temp;
            count++;
        }
        return count;
    }
}
