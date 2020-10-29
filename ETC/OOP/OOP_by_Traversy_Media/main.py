class Customer:
	def __init__(self, name, membership_type):
		self.name = name
		self.membership_type = membership_type


customers = [
	Customer('Caleb', 'Stone'),
	Customer('brad', 'Gold'),
	Customer('Test', 'Crazy')
]

print(customers[2].name)
