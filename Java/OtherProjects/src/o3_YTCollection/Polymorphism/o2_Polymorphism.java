package o3_YTCollection.Polymorphism;

// STATIC POLYMORPHISM
class MyClass{
    int height;

    MyClass() {
        System.out.println("Bricks");
        height = 0;
    }

    MyClass(int i) {
        System.out.println("Building new house that is " + i + " feet tall");
        height = i;
    }

    void info() {
        System.out.println("House is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": House is " + height + " feet tall");
    }
}

// DYNAMIC POLYMORPHISM
class Animal {
    public void move() {
        System.out.println("Animal can move");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}

public class o2_Polymorphism {
    /* WHAT IS POLYMORPHISM
    * Poly -> Many, Morphism -> Forms
    * Polymorphism is the ability of an
    * entity to take several forms
    *
    * STATIC POLYMORPHISM
    * A polymorphism that is resolved during compile time is
    * known as static polymorphism. Method overloading is an
    * example of compile time polymorphism.
    *
    * DYNAMIC POLYMORPHISM
    * Dynamic polymorphism is a process in which a call to an
    * overridden method is resolved at runtime, that's why it is
    * called runtime polymorphism
    *
    * ADVANTAGES OF DYNAMIC POLYMORPHISM
    *   - Support method overriding
    *   - Common method specification
    *
    * SUPER KEYWORD
    * super is a keyword. It is used inside a
    * sub-class method definition to call a
    * method defined in the super class.
    * */
    public static void main(String[] args) {
        // Static polymorphism
//        MyClass t = new MyClass(5);
//        t.info();
//        t.info("Overloaded Method");

        //Dynamic polymorphism
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object

        a.move(); // runs the method in animal class
        b.move(); // runs the method in dog class


    }
}
