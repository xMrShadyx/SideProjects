from math import pi


def circle_area(r):
	return pi * (r ** 2)


# Test Function
radii = [2, 0, -3, 2 + 5j, True, 'Radius']
try:
	for r in radii:
		A = circle_area(r)
		print('Area of circles with r = {radius} is {area}'.format(radius=r, area=A))
except TypeError:
	print(f"Unsupported operand type {type(r)} for {r}")
