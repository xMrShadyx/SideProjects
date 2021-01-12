healty = ['kale chips', 'broccoli']
backpack = ['pizza', 'frozen custard', 'apple crisp', 'kale chips']
print(id(backpack))



backpack[:] = [item for item in backpack if item in healty]
print(id(backpack))
