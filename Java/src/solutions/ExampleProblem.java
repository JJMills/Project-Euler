package solutions;

import framework.Problem;
import framework.ProblemInfo;

@ProblemInfo(
        description = "Example Problem",
        number = 1
)
public class ExampleProblem extends Problem {
    @Override
    public void solve() {
        // Computing stuff...
        System.out.println("Solution found: 42");
    }
}
