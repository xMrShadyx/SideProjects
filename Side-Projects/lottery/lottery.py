import random

list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
         11, 12, 13, 14, 15, 16, 17, 18,
         19, 20, 21, 22, 23, 24, 25, 26,
         27, 28, 29, 30, 31, 32, 33, 34, 35]

list2 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
         11, 12, 13, 14, 15, 16, 17, 18,
         19, 20, 21, 22, 23, 24, 25, 26,
         27, 28, 29, 30, 31, 32, 33, 34, 35,
         36, 37, 38, 39, 40, 41, 42, 43, 44,
         45, 46, 47, 48, 49]

first_random_list = random.sample(list1, 5)
first_random_list2 = random.sample(list2, 6)

user_list = []
dec_number = 0

print("Welcome to lottery game, here you can try your luck.")
print("To play 5/35 please write next line 5")
print("Other wise to play 6/49 write 6")
bet = float(input("For better fun u can bet float amount of money: "))
n = int(input("Enter type of game 5 for 5/35 or 6 for 6/49: "))

money = bet

if n == 5:
    for i in range(0, n):
        dec_number = i + 1
        ele = int(input(f"Enter Number {dec_number}: "))
        user_list.append(ele)

    matching_numbers = list(set(user_list).intersection(set(first_random_list)))
    lenght_of_matching = len(matching_numbers)
    win = money * lenght_of_matching

    if matching_numbers == []:
        print("No Matching Numbers")
    else:
        print()
        print(f"You win {win}$")
        print(f"Matching numbers: {matching_numbers}")
elif n == 6:
    for i in range(0, n):
        dec_number = i + 1
        ele = int(input(f"Enter Number {dec_number}: "))
        user_list.append(ele)

    matching_numbers = list(set(user_list).intersection(set(first_random_list2)))
    lenght_of_matching = len(matching_numbers)
    win = money * lenght_of_matching

    if matching_numbers == []:
        print("No Matching Numbers")
    else:
        print()
        print(f"You win {win}$")
        print(f"Matching numbers: {matching_numbers}")

print(f"Lottery numbers: {first_random_list}")
print(f"Your numbers: {user_list}")
