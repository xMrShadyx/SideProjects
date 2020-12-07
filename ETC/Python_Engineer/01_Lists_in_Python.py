# Lists: ordered, mutable, allows duplicate elements
my_list = ["banana", "cherry", "apple"]
print(my_list)

my_list2 = [5, True, "apple", "apple"]
print(my_list2)

item = my_list[1]
print(item)

for i in my_list:
    if i in my_list:
        print("yes")
    else:
        print("no")

print(len(my_list))

my_list.append("lemon")
print(my_list)
