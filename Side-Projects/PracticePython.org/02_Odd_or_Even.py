num = int(input())
check = int(input())

comb = num % check

if comb % 2 != 0:
    print('odd')
else:
    print('even')
