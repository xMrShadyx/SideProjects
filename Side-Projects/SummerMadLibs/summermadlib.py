from time import sleep

CGREEN = '\33[32m'
CPINK = '\33[35m'
CRED = '\33[31m'
CBLUE = '\33[34m'
CORANGE = '\33[33m'
END = '\33[0m'

lives = 10

text1 = 'Last summer, my mom and dad too me and _______'
text2 = 'on a trip to ______. The weather there is very'
text3 = '______! Northern ______ has many'
text4 = '______, and they make ______ _____ there.'
text5 = 'Many people also go to ______ to ______ or'
text6 = 'see the _____. The poeple that live there love to'
text7 = 'eat ______ and are proud of their big'
text8 = '______. They also like to ______ in'
text9 = 'the sun and swim in the ______! It was a really'
text10 = '______ trip!'

answ1 = ''
answ2 = ''
answ3 = ''
answ4 = ''
answ5 = ''
answ6 = ''
answ7 = ''
answ8 = ''
answ9 = ''
answ10 = ''
answ11 = ''
answ12 = ''
answ13 = ''
answ14 = ''
answ15 = ''

print(CPINK + 'Welcome To Summer Mad Libs !! Wooo! Jr. Kids Activities.' + END)
print(CBLUE + 'The goal of the game is to answer the questions,' + END)
print(CBLUE + 'there is no correct or wrong answer, as long as u think that way.' + END)
print(CORANGE + 'Are you ready to play?? (y = for yes \ n to quit)' + END)

user_input = input('Whats your choise?: ')

if user_input == 'y':
    print('Loading the first question...')
    sleep(2)
    print(text1)
    print('Hint: Its a (person)')
    answ1 = input(CGREEN + 'Answer?: ' + END)
    print(f'Your suggestion is: {answ1}')
    next_step = input('Would you like to continue? (y/n): ')
    if next_step == 'y':
        print('Loading the second question...')
        sleep(2)
        print(text2)
        print('Hint: Its a (place)')
        answ2 = input(CGREEN + 'Answer?: ' + END)
        print(f'Your suggestion is: {answ2}')
        next_step = input('Would you like to continue? (y/n): ')
        if next_step == 'y':
            print('Loading the next question...')
            sleep(2)
            print(text3)
            print('Hint: Its a (Adjective)')
            answ3 = input(CGREEN + 'Answer?: ' + END)
            print('Hint: Its a (Same place)')
            answ4 = input(CGREEN + 'Answer?: ' + END)
            print(f'Your suggestion is: {answ3}')
            print(f'Your suggestion is: {answ4}')
            next_step = input('Would you like to continue? (y/n): ')
            if next_step == 'y':
                print('Loading the next question...')
                sleep(2)
                print(text4)
                print('Hint: Its a (Plural noun)')
                answ5 = input(CGREEN + 'Answer?: ' + END)
                print('Hint: Its a (Adjective)')
                answ6 = input(CGREEN + 'Answer?: ' + END)
                print('Hint: Its a (Plural noun)')
                answ7 = input(CGREEN + 'Answer?: ' + END)
                print(f'Your suggestion is: {answ5}')
                print(f'Your suggestion is: {answ6}')
                print(f'Your suggestion is: {answ7}')
                next_step = input('Would you like to continue? (y/n): ')
                if next_step == 'y':
                    print('Loading the next question...')
                    sleep(2)
                    print(text5)
                    print('Hint: Its a (Place)')
                    answ8 = input(CGREEN + 'Answer?: ' + END)
                    print('Hint: Its a (Action verb)')
                    answ9 = input(CGREEN + 'Answer?: ' + END)
                    print(f'Your suggestion is: {answ8}')
                    print(f'Your suggestion is: {answ9}')
                    next_step = input('Would you like to continue? (y/n): ')
                    if next_step == 'y':
                        print('Loading the next question...')
                        sleep(2)
                        print(text6)
                        print('Hint: Its a (Plural noun)')
                        answ10 = input(CGREEN + 'Answer?: ' + END)
                        print(f'Your suggestion is: {answ10}')
                        next_step = input('Would you like to continue? (y/n): ')
                        if next_step == 'y':
                            print('Loading the next question...')
                            sleep(2)
                            print(text7)
                            print('Hint: Its a (Plural noun)')
                            answ11 = input(CGREEN + 'Answer?: ' + END)
                            print(f'Your suggestion is: {answ11}')
                            next_step = input('Would you like to continue? (y/n): ')
                            if next_step == 'y':
                                print('Loading the next question...')
                                sleep(2)
                                print(text8)
                                print('Hint: Its a (Noun)')
                                answ12 = input(CGREEN + 'Answer?: ' + END)
                                print('Hint: Its a (Action verb)')
                                answ13 = input(CGREEN + 'Answer?: ' + END)
                                print(f'Your suggestion is: {answ12}')
                                print(f'Your suggestion is: {answ13}')
                                next_step = input('Would you like to continue? (y/n): ')
                                if next_step == 'y':
                                    print('Loading the next question...')
                                    sleep(2)
                                    print(text9)
                                    print('Hint: Its a (Plural noun)')
                                    answ14 = input(CGREEN + 'Answer?: ' + END)
                                    print(f'Your suggestion is: {answ14}')
                                    next_step = input('Would you like to continue? (y/n): ')
                                    if next_step == 'y':
                                        print('Loading the last!! question...')
                                        sleep(2)
                                        print(text10)
                                        print('Hint: Its a (Plural noun)')
                                        answ15 = input(CGREEN + 'Answer?: ' + END)
                                        print(f'Your suggestion is: {answ15}')
                                        print(CRED + 'So far so goood... lets see whats your suggestions.' + END)
                                        print(CRED + 'You\'ve finished the game, in a moment results will load.' + END)
                                        print(CRED + 'LOADING RESULTS' + END)
                                        sleep(4)
                                        print(CRED + "<-----------Summer Mad Libs----------->" + END)
                                        print(f'Last summer, my mom and dad too me and {answ1}')
                                        print(f'on a trip to {answ2}. The weather there is very')
                                        print(f'{answ3}! Northern {answ4} has many')
                                        print(f'{answ5}, and they make {answ6} {answ7} there.')
                                        print(f'Many people also go to {answ8} to {answ9} or')
                                        print(f'see the {answ10}. The poeple that live there love to')
                                        print(f'eat {answ11} and are proud of their big')
                                        print(f'{answ12}. They also like to {answ13} in')
                                        print(f'the sun and swim in the {answ14}! It was a really')
                                        print(f'{answ15} trip!')
                                        print(CRED + "<-----------Summer Mad Libs----------->" + END)
                                else:
                                    print('Loading progression so far...')
                                    sleep(2)
                                    print(CRED + "<-----------Summer Mad Libs----------->" + END)
                                    print(f'Last summer, my mom and dad too me and {answ1}')
                                    print(f'on a trip to {answ2}. The weather there is very')
                                    print(f'{answ3}! Northern {answ4} has many')
                                    print(f'{answ5}, and they make {answ6} {answ7} there.')
                                    print(f'Many people also go to {answ8} to {answ9} or')
                                    print(f'see the {answ10}. The poeple that live there love to')
                                    print(f'eat {answ11} and are proud of their big')
                                    print(f'{answ12}. They also like to {answ13} in')
                                    print(f'the sun and swim in the {answ14}! It was a really')
                            else:
                                print('Loading progression so far...')
                                sleep(2)
                                print(CRED + "<-----------Summer Mad Libs----------->" + END)
                                print(f'Last summer, my mom and dad too me and {answ1}')
                                print(f'on a trip to {answ2}. The weather there is very')
                                print(f'{answ3}! Northern {answ4} has many')
                                print(f'{answ5}, and they make {answ6} {answ7} there.')
                                print(f'Many people also go to {answ8} to {answ9} or')
                                print(f'see the {answ10}. The poeple that live there love to')
                                print(f'eat {answ11} and are proud of their big')
                        else:
                            print('Loading progression so far...')
                            sleep(2)
                            print(CRED + "<-----------Summer Mad Libs----------->" + END)
                            print(f'Last summer, my mom and dad too me and {answ1}')
                            print(f'on a trip to {answ2}. The weather there is very')
                            print(f'{answ3}! Northern {answ4} has many')
                            print(f'{answ5}, and they make {answ6} {answ7} there.')
                            print(f'Many people also go to {answ8} to {answ9} or')
                            print(f'see the {answ10}. The poeple that live there love to')
                    else:
                        print('Loading progression so far...')
                        sleep(2)
                        print(CRED + "<-----------Summer Mad Libs----------->" + END)
                        print(f'Last summer, my mom and dad too me and {answ1}')
                        print(f'on a trip to {answ2}. The weather there is very')
                        print(f'{answ3}! Northern {answ4} has many')
                        print(f'{answ5}, and they make {answ6} {answ7} there.')
                        print(f'Many people also go to {answ8} to {answ9} or')
                else:
                    print('Loading progression so far...')
                    sleep(2)
                    print(CRED + "<-----------Summer Mad Libs----------->" + END)
                    print(f'Last summer, my mom and dad too me and {answ1}')
                    print(f'on a trip to {answ2}. The weather there is very')
                    print(f'{answ3}! Northern {answ4} has many')
                    print(f'{answ5}, and they make {answ6} {answ7} there.')
            else:
                print('Loading progression so far...')
                sleep(2)
                print(CRED + "<-----------Summer Mad Libs----------->" + END)
                print(f'Last summer, my mom and dad too me and {answ1}')
                print(f'on a trip to {answ2}. The weather there is very')
                print(f'{answ3}! Northern {answ4} has many')
        else:
            print('Loading progression so far...')
            sleep(2)
            print(CRED + "<-----------Summer Mad Libs----------->" + END)
            print(f'Last summer, my mom and dad too me and {answ1}')
            print(f'on a trip to {answ2}. The weather there is very')
    else:
        print('Loading progression so far...')
        sleep(2)
        print(CRED + "<-----------Summer Mad Libs----------->" + END)
        print(f'Last summer, my mom and dad too me and {answ1}')
        print('Is that all you\'ve got??')
else:
    print("Thanks cya later :)")
