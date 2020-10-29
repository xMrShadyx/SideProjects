# Class Methods
'''
class Person:
    number_of_people = 0

    def __init__(self, name):
        self.name = name
        Person.add_person()

    @classmethod
    def number_of_people_(cls):
        return cls.number_of_people

    @classmethod
    def add_person(cls):
        cls.number_of_people += 1


p1 = Person("Bot")
p2 = Person("Got")

print(Person.number_of_people_())
'''

# Static Methods

class Math:

    @staticmethod
    def add5(x):
        return x + 5

    @staticmethod
    def add10(x):
        return x + 10

    @staticmethod
    def pr(x):
        print(x)

print(Math.add5(5))
print(Math.add5(10))
Math.pr("Testing subject #1")
