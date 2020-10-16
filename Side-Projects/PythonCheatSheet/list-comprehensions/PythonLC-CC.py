#!/usr/bin/env python
# coding: utf-8

# In[ ]:


Python List Comprehensions Cheat Sheet by Corey Schafer


# In[5]:


nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# I want 'n' for each 'n' in nums
my_list = []
for n in nums:
	my_list.append(n)
print(my_list)


# In[4]:


my_list = [n for n in nums]
print(my_list)


# In[6]:


# I want 'n*n' for each 'n' nums
my_list = []
for n in nums:
	my_list.append(n*n)
print(my_list)


# In[7]:


my_list = [n*n for n in nums]
print(my_list)


# In[8]:


# I want 'n' for each 'n' in nums if 'n' is even
my_list = []
for n in nums:
	if n%2 == 0:
		my_list.append(n)
print(my_list)


# In[9]:


my_list = [n for n in nums if n % 2 == 0]
print(my_list)


# In[10]:


# I want a (latter, num) pair for each letter in 'abcd' and each number in 0123
my_list = []
for letter in 'abcd':
	for num in range(4):
		my_list.append((letter, num))
print(my_list)


# In[11]:


my_list = [(letter,num) for letter in 'abcd' for num in range(4)]
print(my_list)


# In[12]:


# Dictionary Comprehensions
names = ['Bruce', 'Clark', 'Peter', 'Logan', 'Wade']
heros = ['Batman', 'Superman', 'Spiderman', 'Wolverine', 'Deadpool']
print(list(zip(names, heros)))


# In[13]:


# I want a dict{'name': 'hero'} for each name,hero in zip(name, heros)
my_dict = {}
for name, hero in zip(names, heros):
	my_dict[name] = hero
print(my_dict)


# In[14]:


my_dict = {name: hero for name, hero in zip(names, heros)}
print(my_dict)


# In[15]:


# If name not equal to Peter

my_dict = {name: hero for name, hero in zip(names, heros) if name != 'Peter'}
print(my_dict)


# In[17]:


# Set Comprehensions
nums = [1, 1, 2, 1, 3, 4, 3, 4, 5, 5, 6, 7, 8, 7, 9, 9]
my_set = set()
for n in nums:
	my_set.add(n)
print(my_set)


# In[18]:


my_set = {n for n in nums}
print(my_set)


# In[21]:


# Generator Expressions
# I want to yield 'n*n' for each 'n' in nums


def gen_func(nums):
	for n in nums:
		yield n * n


my_gen = gen_func(nums)

for i in my_gen:
	print(i, end=" ")


# In[22]:


my_gen = (n * n for n in nums)

for i in my_gen:
	print(i, end=" ")


# In[ ]:




