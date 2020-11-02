class Character:
    """A sample Character class"""

    def __init__(self, name, location):
        self.name = name
        self.location = location


    def __repr__(self):
        return "Character ('{}' ,last known location: '{}')".format(self.name, self.location)



