# data = []
# # Enqueue
# data.append(5)
# # element = data.pop()
# # print(element)
# # print(data)

# # print(data[len(data) - 1]) # enqueue peek element

# data.append(10)
# data.append(15)
# data.append(20)

# # data.pop()
# # data.pop()

# # print(data)

# # Queue / dequeue

# data.pop(0)
# data.pop(0)
# print(data[0]) # dequeue peek element

# Deque in Python
# from collections import deque

# data = deque()
# data.append("Caleb")
# element = data.popleft()
# print(element)
# print(data)


# Custom implementations, using a Class

class Stack:
    def __init__(self):
        self._data = []
    
    def push(self, data):
        self._data.append(data)

    def pop(self):
        return self._data.pop()

    def peek(self):
        return self._data[len(self._data) - 1]

stack = Stack()
stack.push(5)
print(stack.peek())
test = stack.pop()
print(test)


# Creating a peek method