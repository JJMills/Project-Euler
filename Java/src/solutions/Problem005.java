package solutions;

import framework.Problem;
import framework.ProblemInfo;
import utilities.NumberTheory;

@ProblemInfo(
        description = "Smallest multiple",
        number = 5
)
public class Problem005 extends Problem {
    @Override
    public void solve() {
        int lcm = 1;
        for (int i = 2; i <= 20; i++) {
            lcm = NumberTheory.lowestCommonMultiple(lcm, i);
        }
        System.out.println(lcm);
    }
}