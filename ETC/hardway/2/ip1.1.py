#Optional Parameters #1
class car(object):
	def __init__(self, make, model, year, condition='New', kms=0):
		self.make = make
		self.model = model
		self.year = year
		self.condition = condition
		self.kms = kms

	def display(self, showAll=True):
		if showAll:
			print("This car is a %s %s from %s, it is %s and has %s kms." %(self.make, self.model, self.year, self.condition, self.kms))
		else:
			print("This car is a %s %s from %s" %(self.make, self.model, self.year))

whip = car('Ford', 'Fusion', 2012)
whip.display(False)