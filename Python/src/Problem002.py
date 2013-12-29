__author__ = 'Joel'


def even_fibonacci_below(limit):
    a = 1
    b = 2
    total = 2 # Starting at 2 because the below excludes the first two values of the sequence.
    pos = 0
    while b < limit:
        c = a + b
        a = b
        b = c
        if pos == 2:
            total += c
            pos = 0
        else:
            pos += 1
    return total


print(even_fibonacci_below(4000000))