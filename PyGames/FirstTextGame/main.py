print("Welcome to my first text game!")
name = input("What is your name? ")
age = int(input("Whats your age? "))

#print('Hello', name, 'you are', age, 'years old.')

health = 10

if age >= 18:
    print('You are old enough to play!')

    wants_to_play = input("Do you want to play? (Yes/No) ").lower()
    if wants_to_play == 'yes':
        print("You are starting with", health, "health")
        print("Let's play!")

        left_or_right = input("First chouse... Left or Right (left/right)? ").lower()
        if left_or_right == "left":
            ans = input("Nice.. You fallow the path and reach a lake... Do you swim across or go around (across or around) ? ").lower()
            if ans == "around":
                print("You went around and reached the other side of the lake")
            elif ans == "across":
                print("You manage to get across, but were bit by a fish and lost 5 healt.")
                health -= 5
                print(health, "Health left!")

            ans = input("You notice a house and a river. Which do you go to? (river/house) ").lower()
            if ans == "house":
                print("You go to the house and are gretted by the owner... He doesn't like you and u lose 5 health")
                health -= 5
                print(health, "Health left!!")

                if health <= 0:
                    print("You now have 0 health and you lost the game...")
                else:
                    print("You have survived the game!!!")
            else:
                print("You fell in the river and lost....")
        else:
            print("You fell down and lost.. try again!")
    else:
        print("Well see ya later then!")
else:
    print("You are not old enough to play...")
    
