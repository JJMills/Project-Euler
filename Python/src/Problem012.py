import functools
import operator

__author__ = 'Joel'


def get_prime_factorisation(number):
    primes = {2: 0}
    prime = 1
    while number != 1:
        prime += 1
        count = 0
        while number % prime == 0:
            count += 1
            number /= prime
        if count != 0:
            primes[prime] = count
    return primes


def get_number_of_divisors(number):
    return functools.reduce(operator.mul, [x + 1 for x in get_prime_factorisation(number).values()])


def get_nth_divisors(divisor):
    n = 1
    while True:
        triangular_number = sum(range(n + 1))
        if get_number_of_divisors(triangular_number) > divisor:
            return triangular_number
        n += 1


print(get_nth_divisors(500))