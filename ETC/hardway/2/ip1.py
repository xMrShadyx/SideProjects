#Optional Parameters #1
def func(word, add=5, freq=1):
	print(word*(freq + add))

call = func('tim ',5,5)
print(call)