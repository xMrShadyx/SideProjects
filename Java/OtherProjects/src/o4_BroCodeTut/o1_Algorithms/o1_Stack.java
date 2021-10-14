package o4_BroCodeTut.o1_Algorithms;

import java.util.Stack;

public class o1_Stack {
    public static void main(String[] args) {
        // stack - LIFO data structure, Last-in First-Out.
        //         Store objects into a sort of vertical tower
        //         push() to add to top
        //         pull() to remove from top

        Stack<String> stack = new Stack<>();
//        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        stack.pop();
        System.out.println(stack.empty());
        System.out.println(stack);
        System.out.println(stack.peek());


    }
}
