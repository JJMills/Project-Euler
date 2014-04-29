package solutions;

import framework.Problem;
import framework.ProblemInfo;
import utilities.NumberTheory;

@ProblemInfo(
        description = "10001st prime",
        number = 7
)
public class Problem007 extends Problem {
    @Override
    public Object solve() {
        int i = 0;
        int val = 2;
        while (true) {
            if (NumberTheory.isPrime(val) && ++i == 10001) {
                break;
            }
            val++;
        }
        return val;
    }
}