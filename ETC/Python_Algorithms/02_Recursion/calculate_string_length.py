# Given a string, calculate the length of the string.

input_str = "LucidProgramming"
print(f"{len(input_str)} Build in len function")


def iterative_str_len(input_str):
    count = 0
    for item in range(len(input_str)):
        count += 1
    return count


def recursive_str_len(input_str):
    if input_str == '':
        return 0
    return 1 + recursive_str_len(input_str[1:])


print(f"{iterative_str_len(input_str)} Iterative function")
print(f"{iterative_str_len(input_str)} Recursive function")
