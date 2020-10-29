#Collections/namedtuple()

import collections
from collections import namedtuple

Point = namedtuple('Point','x y z')
newP = Point(3,4,5)
print(newP)
print(newP.x, newP.y, newP.z)
print(newP[0])
print(newP._asdict())
print(newP._fields)

newP = newP._replace(y=6)
print(newP)

p2 = Point._make(['a', 'b', 'c'])
print(p2)

# Point = namedtuple('Point',['q', 'w', 'e'])
# newP = Point(3,4,5)
# print(newP)


# Point = namedtuple('Point', {'z':0, 'x':0, 'c':0})
# newP = Point(3,4,5)
# print(newP)