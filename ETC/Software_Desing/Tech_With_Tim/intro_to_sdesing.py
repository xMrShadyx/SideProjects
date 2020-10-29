# Example 1 - Common Design Mistakes

# Program Goal, print a list of words delimited by comas

# Solution 1 - What's Wrong?
list_of_words = ["hello", "yes", "goodbye", "last", "hello"]
print("Solution 1 -> " + list_of_words[0] + ", " + list_of_words[1] + ", " + list_of_words[2] + ", " + list_of_words[3] + ", " + list_of_words[4])

# Solution 2:
to_print = "Solution 2 -> " + ''
for i in range(len(list_of_words)):
	to_print += list_of_words[i]
	if i != len(list_of_words) - 1:
		to_print += ', '
print(to_print)

# Solution 3:
print("Solution 3 -> " + ", ".join(list_of_words))

# Solution 4:
print("Solution 4 -> " + ", ".join([el for el in list_of_words]))

# Solution 5:
DELIMITER = ", "
print("Solution 5 -> " + DELIMITER.join(list_of_words))