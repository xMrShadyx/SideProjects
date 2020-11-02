import sqlite3
from employee import Character

conn = sqlite3.connect('char_save.db')

c = conn.cursor()


# c.execute("""CREATE TABLE char_save (
#             name text,
#             location integer
#             )""")


def create_character(chr):
	with conn:
		c.execute("INSERT INTO char_save VALUES (:name, :location)", {'name': chr.name, 'location': chr.location})


def find_char(char_name):
	c.execute("SELECT * FROM char_save WHERE name=:name", {'name': char_name})
	return c.fetchall()


# def update_pay(name, new_loc):
# 	with conn:
# 		c.execute("UPDATE char_save SET location = :new_location WHERE name = :name AND location = :location", {'name': name, 'new_location': new_loc})


def delete_char(chr):
	with conn:
		c.execute("DELETE from char_save WHERE name = :name", {'name': chr.name})


chr_1 = Character('xMrShadyx', 0)
# create_character(chr_1)

chr_1 = find_char('xMrShadyx')
print(chr_1)

# update_pay(chr_1, 2)
delete_char(chr_1)
print(chr_1)

conn.close()
