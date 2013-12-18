__author__ = 'Joel'

a = 1
b = 2
total = 2 # Starting at 2 because the below excludes the first two values of the sequence.
while b < 4000000:
    c = a + b
    a = b
    b = c
    if c % 2 == 0:
        total += c
print(total)