# ####### Ordinary Fibanacci Function ########

def fibanacci(n):
    if n == 1:
        return 1
    elif n == 2:
        return 1
    elif n > 2:
        return fibanacci(n - 1) + fibanacci(n - 2)


for n in range(1, 100):
    print(n, ":", fibanacci(n))

# ####### With Memoization ########

# fibonacci_cache = {}
#
#
# def fibanacci(n):
#     # If we have cached the value, the return it
#     if n in fibonacci_cache:
#         return fibonacci_cache[n]
#
#     # Compute the Nth term
#     if n == 1:
#         value = 1
#     elif n == 2:
#         value = 1
#     elif n > 2:
#         value = fibanacci(n - 1) + fibanacci(n - 2)
#
#     # Cache the value and return it
#     fibonacci_cache[n] = value
#     return value
#
#
# for n in range(1, 1001):
#     print(n, ":", fibanacci(n))


# ####### With Memoization Simple Aproach ########
# from functools import lru_cache
#
#
# @lru_cache(maxsize=1000)
# def fibanacci(n):
#     # Check if the input is a positive integer
#     if type(n) != int:
#         raise TypeError("n must be a positive integer")
#     if n < 1:
#         raise TypeError("n must be a positive integer")
#
#     # Compute the Nth term
#     if n == 1:
#         return 1
#     elif n == 2:
#         return 1
#     elif n > 2:
#         return fibanacci(n - 1) + fibanacci(n - 2)
#
#
# for n in range(1, 501):
#     print(f"{n}: {fibanacci(n)} Ratio: {fibanacci(n+1) / fibanacci(n)}")
