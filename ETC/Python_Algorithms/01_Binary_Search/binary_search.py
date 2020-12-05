# Iterative research
data = [2, 4, 5, 7, 8, 9, 12, 14, 17, 19, 22, 25, 27, 28, 33, 37]
target = 7


def linear_search(data, target):
    #  Linear Search
    for i in range(len(data)):
        if data[i] == target:
            return True
    return False


def binary_search_iterative(data, target):
    # Iterative Binary Search
    low = 0
    high = len(data) - 1

    while low <= high:
        mid = (low + high) // 2
        if target == data[mid]:
            return True
        elif target < data[mid]:
            high = mid - 1
        else:
            low = mid + 1
    return False


def binary_search_recursive(data, target, low, high):
    # Recursive binary search
    if low > high:
        return False
    else:
        mid = (low + high) // 2
        if target == data[mid]:
            return True
        elif target < data[mid]:
            return binary_search_recursive(data, target, low, mid - 1)
        else:
            return binary_search_recursive(data, target, mid + 1, high)


print(f"Lnear Search -> {linear_search(data, target)}")
print(f"Binary Iterative Search - > {binary_search_iterative(data, target)}")
print(f"Binary Recursive Search -> {binary_search_recursive(data, target, 0, len(data)-1)}")
