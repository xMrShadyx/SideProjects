"""
Use a stack data structure to convert integer values to binary
"""

from stack_data_structure import Stack


def div_by_2(dec_num):
    s = Stack()

    while dec_num > 0:
        remainer = dec_num % 2
        s.push(remainer)
        dec_num = dec_num // 2

    bin_num = ""
    while not s.is_empty():
        bin_num += str(s.pop())

    return bin_num


print(div_by_2(100))
