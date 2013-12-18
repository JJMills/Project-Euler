public class Problem3 {
	public static void main(String[] args) {
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
