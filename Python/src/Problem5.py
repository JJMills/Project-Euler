__author__ = 'Joel'

def lowestCommonMultiple(a, b):
    val = a
    while val % b != 0:
        val += a
    return val

lcm = 1
for i in range(2, 20):
    lcm = lowestCommonMultiple(lcm, i)
print(lcm)