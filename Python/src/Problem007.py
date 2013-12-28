__author__ = 'Joel'


def is_prime(value):
    if value <= 1: return False
    for i in range(2, value // 2 + 1):
        if value % i == 0: return False
    return True


i = 0
val = 2
while True:
    if is_prime(val):
        i += 1
        if i == 10001:
            break
    val += 1
print(val)
