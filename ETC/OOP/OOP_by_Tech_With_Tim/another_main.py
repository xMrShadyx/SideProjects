class Pet:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def show(self):
        try:
            print(f"I am {self.name} and I am {self.age} years old, and i am {self.color}")
        except AttributeError:
            print(f"I am {self.name} and I am {self.age} years old")


    def speak(self):
        print("I don't know what to say..")

class Cat(Pet):
    def __init__(self, name, age, color):
        super().__init__(name, age)
        self.color = color

    def speak(self):
        print("Meow")

class Dog(Pet):
    def speak(self):
        print("Bark")

class Fish(Pet):
    pass


# p = Pet("Joni", 15)
# p.show()
# c = Cat("Bill", 22, "Black")
# c.show()
# c.speak()
d = Dog("Koko", 12)
d.show()
d.speak()
# f = Fish("Skumria", 12)
# f.show()
# f.speak()
