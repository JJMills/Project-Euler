package solutions;

import framework.Problem;
import framework.ProblemInfo;

@ProblemInfo(
        description = "Largest prime factor",
        number = 3
)
public class Problem003 extends Problem {
    @Override
    public void solve() {
        long number = 600851475143L;
        int prime = 1;
        while (number != 1) {
            prime++;
            while (number % prime == 0) {
                number /= prime;
            }
        }
        System.out.println(prime);
    }
}
