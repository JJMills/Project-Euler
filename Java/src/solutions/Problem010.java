package solutions;

import framework.Problem;
import framework.ProblemInfo;

@ProblemInfo(
        description = "Summation of primes",
        number = 10
)
public class Problem010 extends Problem {
    @Override
    public void solve() {
        long sum = 0L;
        int limit = 2_000_000;
        boolean[] primes = new boolean[limit];
        for (int i = 2; i < limit; i++) {
            int i_ = i - 2;
            if (!primes[i_]) {
                sum += i;
                for (int j = i_; j < limit; j += i) {
                    primes[j] = true;
                }
            }
        }
        System.out.println(sum);
    }
}
