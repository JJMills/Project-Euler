__author__ = 'Joel'


def get_pythagorean_triplet(sum):
    for a in range(sum - 2):
        for b in range(a + 1, sum - 2):
            for c in range(b + 1, sum - 2):
                if a + b + c == sum and a * a + b * b == c * c:
                    return a * b * c

print(get_pythagorean_triplet(1000))