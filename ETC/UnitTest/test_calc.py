import unittest
import calc


class TestCalc(unittest.TestCase):

    def test_add(self):
        self.assertEqual(calc.add(10, 5), 15) #Case #1
        self.assertEqual(calc.add(5, 5), 10)  #Case #2
        self.assertEqual(calc.add(1, 2), 3)   #Case #3
        self.assertEqual(calc.add(4, 5), 9)   #Case #4

    def test_divide(self):
        self.assertEqual(calc.divide(5, 10), 0.5) #Case #1
        self.assertEqual(calc.divide(2, 6), 0.3333333333333333) #Case #2
        self.assertEqual(calc.divide(2, 8), 0.25) #Case #3
        self.assertEqual(calc.divide(4, 20), 0.2) #Case #4

        #Raise Value Error test:
        #self.assertRaises(ValueError, calc.divide, 10, 0) #Method #1
        # with self.assertRaises(ValueError): #Context Method #2
        #     calc.divide(10, 0)

    def test_multiply(self):
        self.assertEqual(calc.multiply(10, 5), 50) #Case #1
        self.assertEqual(calc.multiply(5, 5), 25) #Case #2
        self.assertEqual(calc.multiply(3, 7), 21) #Case #3
        self.assertEqual(calc.multiply(3, 6), 18) #Case #4

    def test_subtract(self):
        self.assertEqual(calc.subtract(10, 5), 5) #Case #1
        self.assertEqual(calc.subtract(5, 5), 0) #Case #2
        self.assertEqual(calc.subtract(3, 7), -4) #Case #3
        self.assertEqual(calc.subtract(3, 6), -3) #Case #4



if __name__ == '__main__':
    unittest.main()
