from datetime import datetime

timer1 = datetime.now()
print(timer1)
for i in range(20):
    test = i << 50

timer2 = datetime.now()
print(timer2)

result = timer2 - timer1
print(result)