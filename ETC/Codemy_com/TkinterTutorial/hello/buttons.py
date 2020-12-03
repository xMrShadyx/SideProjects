from tkinter import *

root = Tk()


def myClick():
	myLabel = Label(root, text="Look! i clicked")
	myLabel.pack()


my_button = Button(root, text="Click Me!", fg="yellow", bg="green", command=myClick)
my_button.pack()

root.mainloop()
