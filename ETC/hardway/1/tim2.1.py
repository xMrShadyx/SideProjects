class Viechle():
	def __init__(self, price, gas, color):
		self.price = price
		self.gas = gas
		self.color = color

	def fillUpTank(self):
		self.gas = 100

	def emptyTank(self):
		self.gas = 0

	def gasLeft(self):
		return self.gas


class Car(Viechle):
	def __init__(self, price, gas, color):
		super().__init__(price, gas, color, speed)
		self.speed = speed

	def beep(self):
		print("Beep, Beep")


class Truck(Viechle):
	def __init__(self, price, gas, color):
		super().__init__(price, gas, color, tires)
		self.tires = tires

	def beep(self):
		print("Honk, honk")