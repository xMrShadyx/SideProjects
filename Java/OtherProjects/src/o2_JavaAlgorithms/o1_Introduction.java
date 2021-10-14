package o2_JavaAlgorithms;

/*
* What are Algorithms?
* Step you take to manipulate data
* Data Structures: The way data is arranged in memory
* Main Data Structure Operations:
* Inserting
* Deleting
* Searching
*
* Arrays:
*
* int[] arrayName = new int[3]
* int thirdValue = arrayName[2]
* int[] arrayName = {12,16,24}
* arrayName[1] -> returns 16
*
* Multidimensional Array:
* String[][][] arrayName = {{{"000"},{"100"},{"200"},{"300"}},
*                           {{"010"},{"110"},{"210"},{"310"}},
*                           {{"020"},{"120"},{"220"},{"320"}}},
* arrayName[How many down(3)][How many across(4)][How many of these groups(1)]
*
* */

public class o1_Introduction {
    private  int[] theArray = new int[50];
    private  int arraySize = 10;

    public  void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random()*10)+10;
        }
    }
    public  void printArray() {
        System.out.println("----------");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
        }
        System.out.println("----------");

    }

    public  int getValueAtIndex(int index) {
        if (index < arraySize) return theArray[index];
        return 0;
    }

    public  boolean doesArrayContainThisValue(int index) {
        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == index) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < (arraySize -1); i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public void insertValue(int index) {
        if (arraySize < 50) {
            theArray[arraySize] = index;
            arraySize++;
        }
    }

    public String linearSearchForValue(int value) {
        boolean valueInArray = false;
        String indexesWithValue = "";
        System.out.println("The value was found in the following: ");

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                valueInArray = true;
                System.out.print(i + " ");
                indexesWithValue += i + " ";
            }
        }
        System.out.println();
        if (!valueInArray) indexesWithValue = "None";
        return indexesWithValue;
    }

    public static void main(String[] args) {
        o1_Introduction newArray = new o1_Introduction();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueAtIndex(5));
        System.out.println(newArray.doesArrayContainThisValue(5));
        newArray.deleteIndex(5);
        newArray.printArray();
        newArray.insertValue(69);
        newArray.printArray();
        System.out.println(newArray.linearSearchForValue(15));



    }
}
