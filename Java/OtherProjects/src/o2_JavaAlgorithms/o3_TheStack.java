package o2_JavaAlgorithms;

import java.util.Arrays;

public class o3_TheStack {
    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    o3_TheStack(int size) {
        stackSize = size;
        stackArray = new String[size];

        Arrays.fill(stackArray, "-1");
    }
    public void displayTheStack(){
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < stackSize; n++){
            System.out.format("| %2s "+ " ", n);
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < stackSize; n++){
            if(stackArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
    }
    public void pushMany(String multipleValues) {
        String[] tempString = multipleValues.split(" ");
        for (int i = 0; i < tempString.length; i++) {
            push(tempString[i]);
        }
    }

    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else System.out.println("Sorry but the stack is full");
        displayTheStack();
        System.out.println("PUSH " + input + " Was Added to stack");
    }

    public String pop() {
        if (topOfStack >= 0) {
            displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " Was removed from stack\n");
            stackArray[topOfStack] = "-1";
            return stackArray[topOfStack--];
        } else {
            displayTheStack();
            System.out.println("Sorry but the stack is empty");
            return "-1";
        }
    }

    public void popAll() {
        for (int i = topOfStack; i >= 0 ; i--) {
            pop();
        }
    }

    public String peek() {
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " Is at the top of stack\n");

        return stackArray[topOfStack];
    }

    public static void main(String[] args) {
        o3_TheStack theStack = new o3_TheStack(10);
        theStack.push("10");
        theStack.push("15");
        theStack.peek();
//        theStack.pop();
        theStack.pushMany("10 12 25 31 21");
        theStack.popAll();
        theStack.displayTheStack();

    }
}
