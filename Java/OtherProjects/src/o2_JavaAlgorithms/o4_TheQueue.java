package o2_JavaAlgorithms;

import java.sql.SQLOutput;
import java.util.Arrays;

public class o4_TheQueue {
    private String[] queueArray;
    private int queueSize;
    private int front, rear, numberOfItems = 0;

    o4_TheQueue(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void displayTheQueue(){
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < queueSize; n++){
            System.out.format("| %2s "+ " ", n);
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        for(int n = 0; n < queueSize; n++){
            if(queueArray[n].equals("-1")) System.out.print("|     ");
            else System.out.print(String.format("| %2s "+ " ", queueArray[n]));
        }
        System.out.println("|");
        for(int n = 0; n < 61; n++)System.out.print("-");
        System.out.println();
        // Number of spaces to put before the F
        int spacesBeforeFront = 3*(2*(front+1)-1);
        for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");
        System.out.print("F");
        // Number of spaces to put before the R
        int spacesBeforeRear = (2*(3*rear)-1) - (spacesBeforeFront);
        for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");
        System.out.print("R");
        System.out.println("\n");
    }

    public void insert(String input){
        if (numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            System.out.println("INSERT " + input + " Was Added to the Queue\n");
        } else {
            System.out.println("Sorry but the queue is full");
        }
    }

    public void remove() {
        if (numberOfItems > 0) {
            System.out.println("REMOVE " + queueArray[front] + " Was removed from the queue\n");
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
        } else {
            System.out.println("Sorry but the queue is empty");
        }

    }

    public void peek() {
        System.out.println("The first element is " + queueArray[front]);
    }

    public void priorityInsert(String input) {
        int i = 0;
        if (numberOfItems == 0) {
            insert(input);
        } else {
            for (int j = numberOfItems - 1; j >= 0 ; j--) {
                if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    queueArray[i + 1] = queueArray[i];
                } else break;
            }
            queueArray[i + 1] = input;
            rear++;
            numberOfItems++;
        }
    }

    public static void main(String[] args) {
        o4_TheQueue theQueue = new o4_TheQueue(10);
        theQueue.insert("15");
        theQueue.insert("12");
        theQueue.insert("32");
        theQueue.insert("22");
        theQueue.displayTheQueue();

    }
}
