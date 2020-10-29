# List Comprehensions
# my_list = [1, 2, 3]
#
#
# new_list = [item * 2 for item in my_list]

# for item in my_list:
# 	new_list.append(item * 2)
# print(new_list)


# users = [{'name': 'Manuel', 'age': 31},
#          {'name': 'Max', 'age': 30},
#          {'name': 'Dirk', 'age': 38}
#          ]
#
# user_name = [user['name'] for user in users if user['age'] > 30 and user['name'] == 'Dirk']
# print(user_name)


user_groups = [
	[
		{'name': 'Manuel', 'age': 31},
		{'name': 'Max', 'age': 30}
	],
	[
		{'name': 'Sarah', 'age': 29},
		{'name': 'July', 'age': 32}

	]
]

user_name = [person['name'] for group in user_groups for person in group if person['age'] > 30]
print(user_name)