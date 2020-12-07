"""
Stack data structure
"""


class Stack():
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        return self.items.pop()

    def is_empty(self):
        return len(self.items) == 0

    def peek(self):
        if len(self.items) != 0:
            return self.items[-1]

    def get_stack(self):
        return self.items


# s = Stack()
# s.push("A")
# s.push("B")
# s.push("C")
# s.push("D")
# print(s.get_stack())
# print(s.peek())

# print(s.get_stack())
# s.pop()
# print(s.get_stack())
# print(s.is_empty())
