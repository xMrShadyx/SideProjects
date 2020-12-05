'''
Implement an algorithm to determine if a string has all
unique characters.
'''

unique_str = "AbCDefG"
non_unique_str = "non Unique STR"


def normalize(input_str):
    input_str = input_str.replace(" ", "")
    return input_str.lower()


def is_unique_1(input_str):
    d = dict()
    for i in input_str:
        if i in d:
            return False
        else:
            d[i] = 1
    return True


def is_unique_2(input_str):
    return len(input_str) == len(set(input_str))


def is_unique_3(input_str):
    alpha = "abcdefghijklmnopqrstuvwxyz"
    for i in input_str:
        if i in alpha:
            alpha = alpha.replace(i, "")
        else:
            return False
    return True


unique_str = normalize(unique_str)
non_unique_str = normalize(non_unique_str)

print(unique_str)
print(non_unique_str)
print()
print(is_unique_1(unique_str))
print(is_unique_1(non_unique_str))
print()
print(is_unique_2(unique_str))
print(is_unique_2(non_unique_str))
print()
print(is_unique_3(unique_str))
print(is_unique_3(non_unique_str))
