package o3_YTCollection.Abstract.o3_Abstract;

class Student extends Person {
    private int StudentID;

    public Student(String name, String gender, int studentId) {
        super(name, gender);
        this.StudentID = studentId;

    }

    @Override
    public void Studying() {
        if (StudentID == 0) {
            System.out.println("Not Studying");
            return;
        }
        System.out.println("Perusing a Degree in Bachelor of Engineering");
    }
}

public class Main {
    /*WHAT ARE ABSTRACT CLASSES IN JAVA?
    * Abstract classes in java act as a boundary between the
    * implementation method and its functionality. It is used to
    * exchange the functionality between the Concrete class members
    * and the Abstract Class method
    *
    * WHY DO WE NEED ABSTRACT CLASSES IN JAVA?
    *   - Default Functionality
    *   - Template
    *   - Code Reuseability
    *   - Separates Method Definitions
    *   - Loose Coupling
    *   - Dynamic Method Resolution
    *
    * RULES FOR ABSTRACT CLASSES IN JAVA
    *   - It cannot be instantiated
    *   - It can have final methods
    *   - An abstract class must be declared using Abstract keyword
    *   - It can have abstract and non-abstract methods
    *   - It can have Constructors and static methods also
    *
    * WAYS TO ACHIEVE ABSTRACTION IN JAVA
    * The process of Abstraction in java can be achieved by the
    * following two methods as mention below
    *   - Implementing an Abstract Class
    *   - Implementing an Interface
    *
    * SYNTAX FOR ABSTRACTION IN JAVA
    *   Abstract Class:
    *       abstract class clsName();
    *   Abstract Method:
    *       abstract type methodName();
    *
    * ABSTRACT CLASS VS INTERFACE
    *   - A: Abstract Class can have Abstract and Non-Abstract methods
    *   - I: Interface can have only Abstract methods
    *
    *   - A: Abstract Class includes Non-Final Variables
    *   - I: Interface has only Final Variables
    *
    *   - A: Abstract class has Static, Non-static, Final, Non-Final variables
    *   - I: Interface has Static and Final variables only
    *
    *   - A: Abstract class can implement an interface
    *   - I: Interface will not implement abstract class
    *
    *   - A: Abstract class is implemented using "extends" keyword
    *   - I: Interface is implemented using "implements" keyword
    *
    *   - A: Abstract classes can extend Java classes and Interfaces
    *   - I: Interface can extend only interface
    *
    *   - A: Members can be Private and Protected in an Abstract Class
    *   - I: Members are Public by default in an Interface*/

    public static void main(String[] args) {
        Person student = new Student("Preya", "Female", 0);
        Person student1 = new Student("Karan", "Male", 201021);
        Person student2 = new Student("Kumari", "Female", 122251);
        Person student3 = new Student("John", "Male", 201125);

        student.Studying();
        student1.Studying();
        student2.Studying();
        student3.Studying();
    }
}
