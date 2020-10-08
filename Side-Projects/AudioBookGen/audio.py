import pyttsx3 #pip install pyttsx3
import PyPDF2 #pip install PyPDF2

book = open('testpdf.pdf', 'rb') #to change the book raname testpdf.pdf with your own book.
pdfreader = PyPDF2.PdfFileReader(book)
pages = pdfreader.numPages

speaker = pyttsx3.init()

for num in range(0, pages):
	page = pdfreader.getPage(num)
	text = page.extractText()
	speaker.say(text)
	speaker.runAndWait()