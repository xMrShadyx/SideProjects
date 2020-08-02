import time
import random

list_words = ['about', 'above', 'abuse', 'added', 'adult', 'after', 'again', 'agent', 'agree', 'ahead', 'album', 'alive',
        'allow', 'alone', 'along', 'among', 'angle', 'apart', 'apple', 'apply', 'areas', 'array', 'aside', 'asked',
        'asset', 'audio', 'avoid', 'award', 'aware', 'banks', 'based', 'basic', 'basis', 'beach', 'began', 'begin',
        'being', 'below', 'bible', 'bills', 'birds', 'birth', 'black', 'blade', 'block', 'blood', 'board', 'bonus',
        'books', 'boxes', 'brain', 'brand', 'bread', 'break', 'brief', 'bring', 'broad', 'broke', 'brown', 'build',
        'built', 'bunch', 'cable', 'calls', 'cards', 'carry', 'cases', 'catch', 'cause', 'cells', 'chain', 'chair']

name = input("What is your name: ")

print("Hello, " + name + " Time to play hangman!!!")
print("")

time.sleep(1)

print("Start guessing...")
time.sleep(0.5)

word = random.choice(list_words)
guesses = '0'
turns = 10

while turns > 0:
    fails = 0
    for i in word:
        if i in guesses:
            print(i, end="")
        else:
            print("_", end="")
            fails += 1
    if fails == 0:
        print("")
        print("You won")
        break
    print("")
    guess = input("guess a character: ")
    guesses += guess
    if guess not in word:
        turns -= 1
        print("Wrong")
        print(f"You have {turns} more guesses")
        if turns == 0:
            print("You lose")