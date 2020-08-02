import random
from time import sleep

dice1 = [1, 2, 3, 4, 5, 6]
dice2 = [1, 2, 3, 4, 5, 6]

first_dice = random.sample(dice1, 1)
second_dice = random.sample(dice2, 1)

print("How many dice would you like to roll  1 or 2 ?")
n = int(input('Please type 1 for one dice or 2 for two dices: '))

if n == 1:
    print("Rolling Dices....")
    sleep(2)
    print(f"Dice 1: {first_dice}")
elif n == 2:
    print("Rolling Dices....")
    sleep(2)
    print(f"Dice 1: {first_dice}")
    print(f"Dice 2: {second_dice}")
    matching_dices = list(set(first_dice).intersection(set(second_dice)))
    if matching_dices:
        print("WOW you've got matching dices!!!!")
    else:
        print("")
