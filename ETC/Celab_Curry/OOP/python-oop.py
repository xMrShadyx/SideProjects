class Customer:
    def __init__(self, name, membership_type) -> None:
        self.name = name
        self.membership_type = membership_type

    def update_membership(self, new_membership):
        print("Calculating costs")
        self.membership_type = new_membership

    def __str__(self):
        return self.name + " " + self.membership_type

    def print_all_customers(customer):
        for customer in Customer:
            print(customer)

    def __eq__(self, other):
        if self.name == other.name and self.membership_type == other.membership_type:
            return True
        return False

    __hash__ = None
    __repr__ = __str__


# c = Customer('Caleb', 'Gold')
# print(c.name, c.membership_type)
# c2 = Customer('Brad', 'Bronze')
# print(c2.name, c2.membership_type)

cust = Customer('Test', 'Mest')
cust1 = Customer('Test', 'Mest')
print(cust == cust1)

# customers = [Customer('Caleb', 'Gold'), Customer('Brad', 'Bronze')]
# print(customers[0].membership_type)

# customers[0].update_membership("Broznecs")
# print(customers[0].membership_type)
