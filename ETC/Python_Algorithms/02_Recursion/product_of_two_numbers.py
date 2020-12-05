# Given two numbers, find their product using recursion

x = 500
y = 200

# What is 5 X 3?
# 5 + 5 + 5
# (x=5, y=3)
# if 5 + (5, 2 <- decreasing by 1)
# if 5 + (5, 1 <- decreasing by 1)
# if 5 + (5, 0 == 0 return 0 and break recursion)


def reccursive_multiply(x, y):

    # This cuts down on total number of recursion calls
    if x < y:
        return reccursive_multiply(y, x)

    if y == 0:
        return 0
    return x + reccursive_multiply(x, y-1)


print(x * y)
print(reccursive_multiply(x, y))
