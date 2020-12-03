import mysql.connector

mydb = mysql.connector.connect(
    host="localhost",
    user="root",
    passwd="daredevil",
    database="testdb",  # run create db command before importing this line
    )

# Create Cursor instance for mydb
my_cursor = mydb.cursor()

# sqlStuff = "INSERT INTO users (name, email, age) VALUES (%s, %s, %s)"
# record1 = ("John", "john@example.com", 40)
#
# my_cursor.execute(sqlStuff, record1)
# mydb.commit()
