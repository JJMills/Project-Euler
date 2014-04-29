package solutions;

import framework.Problem;
import framework.ProblemInfo;

@ProblemInfo(
        description = "Multiples of 3 and 5",
        number = 1
)
public class Problem001 extends Problem {
    @Override
    public void solve() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}