import framework.Problem;
import solutions.ExampleProblem;

public class Loader {
    public static void main(String[] args) {
        Problem problem = new ExampleProblem();
        System.out.println(problem);

        long start = System.currentTimeMillis();
        problem.solve();
        long end = System.currentTimeMillis();

        System.out.println("Computation time: " + (end - start) + "ms");
    }
}