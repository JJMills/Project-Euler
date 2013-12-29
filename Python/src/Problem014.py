__author__ = 'Joel'


def collatz_conjecture(n):
    return n / 2 if n % 2 == 0 else 3 * n + 1


visited_map = {}


def get_iterations_of_collatz(start_val):
    if start_val in visited_map:
        return visited_map.get(start_val)
    count = 1
    val = start_val
    while val != 1:
        val = collatz_conjecture(val)
        if val in visited_map:
            length = count + visited_map.get(val)
            visited_map[start_val] = length
            return length
        count += 1
    visited_map[start_val] = count
    return count


def get_max_chain_under(limit):
    max = 0
    starting_number = 0
    for i in range(1, limit):
        collatz = get_iterations_of_collatz(i)
        if collatz > max:
            max = collatz
            starting_number = i
    return starting_number


print(get_max_chain_under(1000000))