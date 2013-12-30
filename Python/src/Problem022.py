import os
import string

__author__ = 'Joel'


def character_to_number(character):
    if character == "\"":
        return 0
    else:
        character = character.lower()
        for i in range(0, 26):
            if character == string.ascii_letters[i]:
                return i + 1


names = open(os.path.dirname(os.path.abspath(__file__)) + "\\..\\resources\\problem022-names.txt").read().split(",")
names.sort()
print(sum([(names.index(line) + 1) * sum(map(character_to_number, line)) for line in names]))