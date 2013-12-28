import functools

__author__ = 'Joel'


def add(x, y):
    return x + y


diff = functools.reduce(add, range(1, 101)) ** 2 - functools.reduce(add, [x ** 2 for x in range(1, 101)])

print(diff)
