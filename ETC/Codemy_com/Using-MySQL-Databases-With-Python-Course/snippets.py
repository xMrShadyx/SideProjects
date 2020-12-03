# Create the database
# my_cursor.execute('CREATE DATABASE testdb')

# SHOW DATABASE
# my_cursor.execute("SHOW DATABASES")
# for db in my_cursor:
#     print(db)

# CREATE TABLE
# my_cursor.execute("CREATE TABLE users (name VARCHAR(255), email VARCHAR(255)\
# , age INTEGER(3), user_id INTEGER AUTO_INCREMENT PRIMARY KEY)")
# my_cursor.execute("SHOW TABLES")
# for table in my_cursor:
#     print(table)

# my_cursor.execute("CREATE TABLE techmart (num_id INTEGER AUTO_INCREMENT\
#  PRIMARY KEY, name VARCHAR(255), discount FLOAT(10), old_price FLOAT(10)\
# , promo_price FLOAT(10), difference FLOAT(10))")
# my_cursor.execute("SHOW TABLES")
# for table in my_cursor:
#     print(table)

# DELETE TABLE
# my_cursor.execute("DROP TABLE techmart")
