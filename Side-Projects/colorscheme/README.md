Color Scheme за принт метод <br>
начин на използване: <br>
<br>
Правите си променливи: <br>
<br>
Първата е началото, цвета който ще използвате. <br>
Пример: CRED = '\033[91m' - Това е червен цвят на текста без заден фонт.<br>
Втората променлива е се слага на края, те е за да може винаги след принта да продължи във бял цвят.<br>
Пример: CEND = '\033[0m'<br>
Втората променлива се използва абсолютно след всеки цвят.<br>

Примерен принт метод с червен цвят.<br>
```python
print(CRED + 'Hello Adventure, you have rights to choose your destiny, choose wisely how hard it should be!' + CEND)
```
<br>

![ColorScheme](random.gif)