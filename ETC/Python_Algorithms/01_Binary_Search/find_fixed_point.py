"""
A fixed point in an array "A" is an index "i" such that A[i] is equal to "i".

Given an array of "n" distinct integers sorted in ascending order, write a
function that returns a "fixed point" in the array. If there is not a
fixed point return "None".
"""


def find_fixed_point_linear(A):
    # Time Complexity: 0(n)
    # Space Complexity: 0(1)
    for i in range(len(A)):
        if A[i] == i:
            return A[i]
    return None


def find_fixed_point(A):
    # Time complexity: 0(log n)
    # Space complexity: 0(1)
    low = 0
    high = len(A) - 1
    while low <= high:
        mid = (low + high) // 2
        if A[mid] < mid:
            low = mid + 1
        elif A[mid] > mid:
            high = mid - 1
        else:
            return A[mid]
    return None


# Fixed point is 3:
#     0    1  2  3  4
A = [-10, -5, 0, 3, 7]

# Fixed point is 0:
#    0  1  2  3   4
# A = [0, 2, 5, 8, 17]

# No fixed point. Return "None":
#     0    1  2  3  4  5
# A = [-10, -5, 3, 4, 7, 9]


print(find_fixed_point_linear(A))
print(find_fixed_point(A))
