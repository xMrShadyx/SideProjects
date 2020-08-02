s = input('Enter text to be converted: ')

def string2bits(s=""):
    return [bin(ord(x))[2:].zfill(8) for x in s]

def bit2strings(b=None):
    return ''.join([chr(int(x, 2)) for x in b])

b = string2bits(s)
print('Binary format printed below here:')
print(b)  # <-- prints Binary Format

print('')
print('')
print('')
print('')
print('')
print('')

convertedback = bit2strings(b)
print('Text Format printed below..')
print(convertedback)  # <--- Prints the text format
