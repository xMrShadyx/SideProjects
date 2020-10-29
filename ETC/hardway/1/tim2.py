class Dog(object):
	def __init__(self, name, age):
		self.name = name
		self.age = age

	def speak(self):
		print("Hi I am", self.name, "and i am", self.age, "years old")


	def talk(self):
		print('Bark')
		print("")


class Cat(Dog):
	def __init__(self, name, age, color):
		super().__init__(name, age)
		self.color = color

	def speak(self):
		print("Hi I am", self.color, "cat, my name is ", self.name, "and im", self.age, "years old")

	def talk(self):
		print("Meow!")
		print("")

	


tim = Cat('tim', 5, 'blue')
tim.speak()
tim.talk()

fred = Dog('Fred', 5)
fred.speak()
fred.talk()

