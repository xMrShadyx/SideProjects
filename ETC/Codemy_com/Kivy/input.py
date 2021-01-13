from typing import Text
import kivy
from kivy.app import App
from kivy.uix.label import Label
from kivy.uix.gridlayout import GridLayout
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button

class MyGridLayout(GridLayout):
    # Initialize infinite keywords
    def __init__(self, **kwargs) -> None:
        # Call grid layout constructor
        super(MyGridLayout, self).__init__(**kwargs)
        # Set columns:
        self.cols = 2

        # Add widgets -> Name
        self.add_widget(Label(text="Name: "))
        # Add inputbox
        self.name = TextInput(multiline=False)
        self.add_widget(self.name)

        # Add widgets -> Pizza
        self.add_widget(Label(text="Favovite Pizza: "))
        # Add inputbox
        self.pizza = TextInput(multiline=False)
        self.add_widget(self.pizza)

        # Add widgets -> Color
        self.add_widget(Label(text="Favorite Color: "))
        # Add inputbox
        self.color = TextInput(multiline=False)
        self.add_widget(self.color)

        # Create a submit button
        self.submit = Button(text="Submit", font_size=32)
        # Bind button
        self.submit.bind(on_press=self.press)
        self.add_widget(self.submit)


    def press(self, instance):
        name = self.name.text
        pizza = self.pizza.text
        color = self.color.text

        # print(f"Hello, {name}, you like {pizza} pizza, and your favorite color is {color}!!")
        # print to screen
        self.add_widget(Label(text=f"Hello, {name}, you like {pizza} pizza, and your favorite color is {color}!!"))

        # Clear the input boxes
        self.name.text = ""
        self.pizza.text = ""
        self.color.text = ""



class MyApp(App):
    def build(self):
        return MyGridLayout()


if __name__ == '__main__':
    MyApp().run()