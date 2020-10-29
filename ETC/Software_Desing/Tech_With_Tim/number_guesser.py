# guess = 1
#
# while True:
# 	num = input("Please guess the number (between 1 and 100): ")
# 	try:
# 		num = int(num)
# 	except:
# 		print("Invalid number, please guess again")
# 		continue
#
# 	if num < 45:
# 		print("Your guess was under.")
# 	elif num > 45:
# 		print("Your guess was over.")
# 	else:
# 		break
# 	guess += 1
# print(f"You Guessed it in {guess} guesses.")

# Better Version:
class GuessNumber:
	def __init__(self, number, mn=0, mx=100):
		self.number = number
		self.guesses = 0
		self.min = mn
		self.max = mx

	def get_guess(self):
		guess = input(f"Please guess a number ({self.min} - {self.max}): ")
		if self.valid_number(guess):
			return int(guess)
		else:
			print("Please enter a valid number.")
			return self.get_guess()

	def valid_number(self, str_number):
		try:
			number = int(str_number)
		except:
			return False

		return self.min <= number <= self.max

	def play(self):
		while True:
			self.guesses += 1
			guess = self.get_guess()
			if guess < self.number:
				print("Your guess was under")
			elif guess > self.number:
				print("Your guess was over")
			else:
				break
		print(f"You guessed it in {self.guesses} guesses")


game = GuessNumber(56, 0, 100)
game.play()
