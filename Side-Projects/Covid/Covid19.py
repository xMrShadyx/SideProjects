import random
from time import sleep

print()

towns = ['Варна','София','Пловдив','Бургас','Русе','Стара Загора', 'Плевен','Сливен','Добрич','Шумен']

amount_with_most_sick = 0
town_with_most_sick = ''
total_sick = 0

for town in towns:
	x = random.randint(20,70)
	sleep(0.3)
	total_sick += x
	if x > amount_with_most_sick:
		amount_with_most_sick = x
		town_with_most_sick = town
	print(f"град: {[town]}, общо болни: {[x]}")
print()
print()
print(f"Най-много болни в: {town_with_most_sick} ->, {amount_with_most_sick}, Общо за цяла България - > {total_sick}")
print()