package solutions;

import framework.Problem;
import framework.ProblemInfo;
import utilities.NumberTheory;

@ProblemInfo(
        description = "Lattice paths",
        number = 15
)
public class Problem015 extends Problem {
    @Override
    public void solve() {
        System.out.println(NumberTheory.getBinomialCoefficient(40, 20));
    }
}