class Dog(object):
	def __init__(self, name, age):
		self.name = name
		self.age = age
		self.li = [1,2,3]

	def speak(self):
		print("Hi I am", self.name, "and i am", self.age, "years old")

	def change_age(self, age):
		self.age = age

	def add_weight(self, weight):
		self.weight = weight



tim = Dog("Tim", 55)
fred = Dog("Fred", 3)
tim.change_age(5)
tim.add_weight(70)
fred.add_weight(50)
tim.speak()
fred.speak()

print(tim.weight)
print(fred.weight)
print(tim.li)
print(fred.li)
