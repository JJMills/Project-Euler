__author__ = 'Joel'


def getPrimeNumbersBelow(limit):
    primes = [False] * limit
    for i in range(2, limit):
        i_ = i - 2
        if not primes[i_]:
            for j in range(i_ + i, limit, i):
                primes[j] = True
    return [i for i in range(limit) if not primes[i]]


print(sum(getPrimeNumbersBelow(2000000)))