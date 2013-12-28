__author__ = 'Joel'

def lowest_common_multiple(a, b):
    val = a
    while val % b != 0:
        val += a
    return val

lcm = 1
for i in range(2, 20):
    lcm = lowest_common_multiple(lcm, i)
print(lcm)