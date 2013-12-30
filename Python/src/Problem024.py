__author__ = 'Joel'


def get_largest_index_less_than(permutation, cap):
    for i in range(len(permutation) - 1, 0, -1):
        if (permutation[cap] < permutation[i]):
            return i


def get_largest_index(permutation):
    k = -1
    for i in range(len(permutation) - 2, -1, -1):
        if (permutation[i] < permutation[i + 1]):
            k = i
            return k
    return k


def get_lexicographic_permutation_at(n):
    permutation = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    for i in range(n - 1):
        k = get_largest_index(permutation)
        if k == -1:
            return permutation
        else:
            l = get_largest_index_less_than(permutation, k)
            temp = permutation[k]
            permutation[k] = permutation[l]
            permutation[l] = temp
            permutation = permutation[:k + 1] + permutation[:k:-1]
    return permutation


print(get_lexicographic_permutation_at(1000000))