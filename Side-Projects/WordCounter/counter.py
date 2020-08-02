# Get the name of the file and open it.
name = input('Enter file: ') # filename.txt
handle = open(name, 'r')

# Count word frequency
counts = dict()
for line in handle:
    words = line.split()
    for word in words:
        counts[word] = counts.get(word, 0) + 1

# Find the most common word
big_count = None
big_word = None
for word, count in counts.items():
    if big_count is None or count > big_count:
        big_word = word
        big_count = count

# all Done
print(big_word, big_count)
