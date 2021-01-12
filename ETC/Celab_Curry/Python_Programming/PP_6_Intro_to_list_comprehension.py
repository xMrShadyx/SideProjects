# healty = ['kale chips', 'broccoli']
# backpack = ['pizza', 'frozen custard', 'apple crisp', 'kale chips']

# backpack[:] = [item for item in backpack if item in healty]

# healty_backpack = []

# for item in backpack:
#     if item in healty:
#         healty_backpack.append(item.upper())

# print(backpack)
# print(healty_backpack)

squares = []
for i in range(10):
    squares.append(i << 25)

print(squares)

squares2 = [i<<25 for i in range(10) if i % 2 == 0]
print(squares2)