from tkinter import *

root = Tk()

e = Entry(root, width=50, bg="white", fg="black", borderwidth=1)
e.pack()
e.insert(0, "Enter your name: ")


def myClick():
	hello = "Hellooo " + e.get() + " ooolleH"
	# myLabel = Label(root, text="Hello, " + e.get() + ".")
	myLabel = Label(root, text=hello)
	myLabel.pack()


myButton = Button(root, text="Enter Your Name", command=myClick)
myButton.pack()
root.mainloop()
