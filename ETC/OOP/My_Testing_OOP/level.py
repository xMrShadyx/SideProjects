monster_names = ['Giants', 'Bomb', 'Reptilian Humanoid', 'Wolf', 'Undead', 'Ghost', 'Zombie', 'Skeleton', 'Spider', 'Bats']

for item in monster_names:
    for k in range(1, len(monster_names)+1):
        print(f"Level: {k}, Name: {item}, Exp drop: {500 * (k ** 2) - (500 * k)}")


#500 * (i ** 2) - (500 * i)