package solutions;

import framework.Problem;
import framework.ProblemInfo;
import utilities.NumberTheory;

@ProblemInfo(
        description = "Sum square difference",
        number = 6
)
public class Problem006 extends Problem {
    @Override
    public Object solve() {
        int sum = NumberTheory.summationTo(100);
        return sum * sum - NumberTheory.summationOfSquaresTo(100);
    }
}