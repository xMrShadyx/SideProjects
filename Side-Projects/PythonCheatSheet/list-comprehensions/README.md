```python
Python List Comprehensions Cheat Sheet by Corey Schafer
https://www.youtube.com/watch?v=3dt4OGnU5sM&t=355s
```


```python
nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# I want 'n' for each 'n' in nums
my_list = []
for n in nums:
	my_list.append(n)
print(my_list)
```

    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    


```python
my_list = [n for n in nums]
print(my_list)
```

    [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    


```python
# I want 'n*n' for each 'n' nums
my_list = []
for n in nums:
	my_list.append(n*n)
print(my_list)
```

    [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
    


```python
my_list = [n*n for n in nums]
print(my_list)
```

    [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]
    


```python
# I want 'n' for each 'n' in nums if 'n' is even
my_list = []
for n in nums:
	if n%2 == 0:
		my_list.append(n)
print(my_list)
```

    [2, 4, 6, 8, 10]
    


```python
my_list = [n for n in nums if n % 2 == 0]
print(my_list)
```

    [2, 4, 6, 8, 10]
    


```python
# I want a (latter, num) pair for each letter in 'abcd' and each number in 0123
my_list = []
for letter in 'abcd':
	for num in range(4):
		my_list.append((letter, num))
print(my_list)
```

    [('a', 0), ('a', 1), ('a', 2), ('a', 3), ('b', 0), ('b', 1), ('b', 2), ('b', 3), ('c', 0), ('c', 1), ('c', 2), ('c', 3), ('d', 0), ('d', 1), ('d', 2), ('d', 3)]
    


```python
my_list = [(letter,num) for letter in 'abcd' for num in range(4)]
print(my_list)
```

    [('a', 0), ('a', 1), ('a', 2), ('a', 3), ('b', 0), ('b', 1), ('b', 2), ('b', 3), ('c', 0), ('c', 1), ('c', 2), ('c', 3), ('d', 0), ('d', 1), ('d', 2), ('d', 3)]
    


```python
# Dictionary Comprehensions
names = ['Bruce', 'Clark', 'Peter', 'Logan', 'Wade']
heros = ['Batman', 'Superman', 'Spiderman', 'Wolverine', 'Deadpool']
print(list(zip(names, heros)))
```

    [('Bruce', 'Batman'), ('Clark', 'Superman'), ('Peter', 'Spiderman'), ('Logan', 'Wolverine'), ('Wade', 'Deadpool')]
    


```python
# I want a dict{'name': 'hero'} for each name,hero in zip(name, heros)
my_dict = {}
for name, hero in zip(names, heros):
	my_dict[name] = hero
print(my_dict)
```

    {'Bruce': 'Batman', 'Clark': 'Superman', 'Peter': 'Spiderman', 'Logan': 'Wolverine', 'Wade': 'Deadpool'}
    


```python
my_dict = {name: hero for name, hero in zip(names, heros)}
print(my_dict)
```

    {'Bruce': 'Batman', 'Clark': 'Superman', 'Peter': 'Spiderman', 'Logan': 'Wolverine', 'Wade': 'Deadpool'}
    


```python
# If name not equal to Peter

my_dict = {name: hero for name, hero in zip(names, heros) if name != 'Peter'}
print(my_dict)
```

    {'Bruce': 'Batman', 'Clark': 'Superman', 'Logan': 'Wolverine', 'Wade': 'Deadpool'}
    


```python
# Set Comprehensions
nums = [1, 1, 2, 1, 3, 4, 3, 4, 5, 5, 6, 7, 8, 7, 9, 9]
my_set = set()
for n in nums:
	my_set.add(n)
print(my_set)
```

    {1, 2, 3, 4, 5, 6, 7, 8, 9}
    


```python
my_set = {n for n in nums}
print(my_set)
```

    {1, 2, 3, 4, 5, 6, 7, 8, 9}
    


```python
# Generator Expressions
# I want to yield 'n*n' for each 'n' in nums


def gen_func(nums):
	for n in nums:
		yield n * n


my_gen = gen_func(nums)

for i in my_gen:
	print(i, end=" ")
```

    1 1 4 1 9 16 9 16 25 25 36 49 64 49 81 81 


```python
my_gen = (n * n for n in nums)

for i in my_gen:
	print(i, end=" ")
```

    1 1 4 1 9 16 9 16 25 25 36 49 64 49 81 81 


```python

```
