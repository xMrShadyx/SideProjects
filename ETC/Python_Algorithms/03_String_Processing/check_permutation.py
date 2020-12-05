"""
Given two strings, write a method to decide if
one is a permutation of the other.
"""

is_permutation_1 = "God"
is_permutation_2 = "dog"

not_permutation_1 = "Not"
not_permutation_2 = "top"


def is_perm_1(str_1, str_2):
    # Time Complexity: 0(n log n)
    # Space Complexity: 0(1)
    str_1 = str_1.lower()
    str_2 = str_2.lower()

    if len(str_1) != len(str_2):
        return False

    str_1 = ''.join(sorted(str_1))
    str_2 = ''.join(sorted(str_2))

    n = len(str_1)
    for i in range(n):
        if str_1[i] != str_2[i]:
            return False
    return True


def is_perm_2(str_1, str_2):
    # Time Complexity: 0(n)
    # Space Complexity: 0(n)
    str_1 = str_1.lower()
    str_2 = str_2.lower()

    if len(str_1) != len(str_2):
        return False

    d = dict()
    for i in str_1:
        if i in d:
            d[i] -= 1
        else:
            d[i] = 1

    for i in str_2:
        if i in d:
            d[i] -= 1
        else:
            d[i] = 1
    return all(value == 0 for value in d.values())


print(is_perm_1(is_permutation_1, is_permutation_2))
print(is_perm_1(not_permutation_1, not_permutation_2))
print()
print(is_perm_2(is_permutation_1, is_permutation_2))
print(is_perm_2(not_permutation_1, not_permutation_2))
