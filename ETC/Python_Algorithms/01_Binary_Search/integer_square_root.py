"""
Write a function that takes a non-negative integer and returns
the largest integer whose square is less than or equal to
the integer given.

Example:
    Assume input is integer 360.

    Then the expected output of the function should be
    17, since 17^2 = 289 < 306. Note that 18^2 = 324 > 300,
    so the number 17 is the correct response.

k = 12
1^2 = 1
2^2 = 4
3^2 = 9
4^2 = 16
"""

k = 12


def integer_square_root(k):
    low = 0
    high = k
    while low <= high:
        mid = (low + high) // 2
        mid_squared = mid * mid
        if mid_squared <= k:
            low = mid + 1
        else:
            high = mid - 1
    return low - 1


print(integer_square_root(k))
