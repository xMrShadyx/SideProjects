#lambda

# def func(x):
# 	func2 = lambda x: x+5
# 	return func2(x) + 85

# func3 = lambda x,y=4: x+y
# #func2 = lambda x: x+5

# print(func(2))
# print(func3(5))
# #print(func2(2))


a = [1,2,3,4,5,6,7,8,9,10]

#newList = list(map(lambda x: x + 5, a))
newList = list(filter(lambda x: x % 2 == 0, a))
print(newList)