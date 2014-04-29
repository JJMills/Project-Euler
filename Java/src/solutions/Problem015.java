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
    public Object solve() {
        return NumberTheory.getBinomialCoefficient(40, 20);
    }
}