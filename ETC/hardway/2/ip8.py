#Collections/Deque(deck)

import collections
from collections import deque

d = deque('hello', maxlen=5)
# d.append('4')
# d.append(5)
# d.appendleft(1)
# d.appendleft('c')
# d.pop()
# d.popleft()
# d.clear()


# d.extend('456')
# d.extend('Hello')
# d.extend([1,2,3])
# d.extendleft('hey')

# d.rotate(3)


print(d)
d.append(1)
print(d)
d.extend([1,2,3])
print(d)