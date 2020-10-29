#collections
import collections
from collections import Counter

#Containers
#list
#set
#dict
#tuple - inmuttable

#Types
#1 counter <- this video


'''a = Counter('gallad')
print(a)
b = Counter(['a', 'a', 'b', 'b', 'c', 'c'])
print(b)
c = Counter({'a':1,'b':2})
print(c)
d = Counter(cats=4, dogs=7)
print(d)

print(list(a.elements()))

print(a.most_common(2))'''

c = Counter(a=4, b=2, c=0, d=-2)
d = ['a', 'b', 'b', 'c']

# c.subtract(d)
# print(c)

# c.update(d)
# print(c)

# c.clear()
# print(c)


c = Counter(a=4, b=2, c=0, d=-2)
d = Counter(['a', 'b', 'b', 'c'])

# print(c+d)
# print(c-d)

# print(c & d)
print(c | d)







#2 deque
#3 namedTuple()
#4 orderdDict
#5 defaultdict