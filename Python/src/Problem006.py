__author__ = 'Joel'


def sum_square_difference_of(n):
    summation = summation_to(n)
    return summation * summation - summation_of_squares_to(n)


def summation_to(n):
    return (n * (n + 1)) / 2


def summation_of_squares_to(n):
    return (n * (n + 1) * (2 * n + 1)) / 6


print(sum_square_difference_of(100))
