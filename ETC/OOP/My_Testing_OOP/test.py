class Character:
    def __init__(self, name, race, strength=10, dexterity=10, vitality=10, intelligence=10):
        self.name = name
        self.race = race
        self.str = strength
        self.dex = dexterity
        self.vit = vitality
        self.int = intelligence
        self.level = 0
        self.freepoints = 0
        self.exp = 0

    def char_info(self):
        return f'Char Level: [{self.level}]: Race: [{self.race}] \n - Strength:     [{self.str}]\n - Dexterity:    [{self.dex}]\n - Vitality:     [{self.vit}]\n - Intelligence: [{self.int}]\n\nLevelup Pts:  [{self.freepoints}]'

    def give_exp(self, amount):
        self.exp = amount
        return f"You've were given: {amount} experience."

    def set_level(self, level):
        self.level = level
        self.freepoints = level * 2

    def add_str(self, value):
        if value != 0:
            self.str += value
            self.freepoints -= value

    def add_dex(self, value):
        if value != 0:
            self.dex += value
            self.freepoints -= value

    def add_vit(self, value):
        if value != 0:
            self.vit += value
            self.freepoints -= value

    def add_int(self, value):
        if value != 0:
            self.int += value
            self.freepoints -= value

    def __repr__(self):
        return f"Your character name: {self.name} and race: {self.race}"


first_character = Character("Isko", "Orc")
print(first_character)
print()
first_character.give_exp(5000)
first_character.set_level(50)
first_character.add_str(38)
first_character.add_dex(25)
first_character.add_vit(12)
first_character.add_int(14)
print(first_character.char_info())

