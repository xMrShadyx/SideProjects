import random

CRED = '\033[91m'
CEND = '\033[0m'

CGRN = '\33[42m'
CRDE = '\33[41m'
CBLU = '\33[101m'

print(CRED + 'Hello Adventure, you have rights to choose your destiny, choose wisely how hard it should be!' + CEND)
n1 = int(input(CGRN + 'Select minimum range:' + CEND + ' '))
n2 = int(input(CRDE +'Select maximum range:' + CEND + ' '))

random = random.randint(n1, n2)

user = int(input('What are you toughs, which number it could be ?: '))

while user != random:
    if random > user:
        user = int(input('Try again its bigger number: '))
    else:
        user = int(input('Try again its smaller number: '))

    if user == random:
        print(CBLU +"You guess the number!!!" + CEND)


