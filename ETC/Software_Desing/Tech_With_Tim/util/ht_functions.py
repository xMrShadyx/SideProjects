
"""
HASH TABLE FUNCTIONS
"""


def get_keys(ht):
	return ht.keys()


def has_key(ht, key):
	return key in ht


def max_value(ht):
	"""
	assume all values are int
	"""
	mx = float("-inf")
	for k, v in ht.items():
		if v > mx:
			mx = v
	return mx


def min_value(ht):
	"""
	assume all values are int
	"""
	mn = float("-inf")
	for k, v in ht.items():
		if v < mn:
			mn = v
	return mn

