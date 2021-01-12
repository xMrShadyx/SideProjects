greetings = ["hi", "hello", "wassap", 'yo']
# print(len(greetings))
number = 1
for item in greetings:
    print(f"{number}: {item}")
    number += 1
print("")

for i in range(len(greetings)):
    print(f"{i+1}: {greetings[i]}")