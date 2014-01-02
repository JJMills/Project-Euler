__author__ = 'Joel'


def multiples():
    return sum([3 * x for x in range(1, 1000 // 3 + 1)]) + sum([5 * x for x in range(1, 1000 // 5)]) - sum(
        [15 * x for x in range(1, 1000 // 15 + 1)])


print(multiples())