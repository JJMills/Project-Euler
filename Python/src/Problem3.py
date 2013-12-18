__author__ = 'Joel'

number = 600851475143
prime = 1
while number != 1:
    prime += 1
    while number % prime == 0:
        number /= prime
print(prime)