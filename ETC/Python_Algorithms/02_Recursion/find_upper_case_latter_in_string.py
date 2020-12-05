# Find Uppercase Letter in String
# Given a string, find the first uppercase character.
# Solve using both an iterative and recursive solution.

input_str_1 = 'lucidProgramming'
input_str_2 = 'LucidProgramming'
input_str_3 = 'lucidprogramming'


def find_uppercase_iterative(input_str):
    for i in range(len(input_str)):
        if input_str[i].isupper():
            return input_str[i]
    return "No uppercase character found"


def find_uppercase_recursive(input_str, idx=0):
    if input_str[idx].isupper():
        return input_str[idx]
    if idx == len(input_str) - 1:
        return "No uppercase character found"
    return find_uppercase_recursive(input_str, idx + 1)


print(f"{find_uppercase_iterative(input_str_1)} :Iterative Function")
print(f"{find_uppercase_iterative(input_str_2)} :Iterative Function")
print(f"{find_uppercase_iterative(input_str_3)} :Iterative Function")

print(f"{find_uppercase_recursive(input_str_1)} :Recursive Function")
print(f"{find_uppercase_recursive(input_str_2)} :Recursive Function")
print(f"{find_uppercase_recursive(input_str_3)} :Recursive Function")
