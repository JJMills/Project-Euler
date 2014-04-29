package solutions;

import framework.Problem;
import framework.ProblemInfo;

@ProblemInfo(
        description = "Example Problem",
        number = 1
)
public class ExampleProblem extends Problem {
    @Override
    public Object solve() {
        // Computing stuff...
        return "Solution found: 42";
    }
}
