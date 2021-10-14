package o3_YTCollection.Abstract;

abstract class Dog {
    public abstract void getBreed(String breed);

    public void bark() {
        System.out.println("Bark");
    }
}

class Chihuahua extends Dog {

    @Override
    public void getBreed(String breed) {
        System.out.println(breed);
    }
}

public class o1_Abstract {
    public static void main(String[] args) {
        Dog c = new Chihuahua();
        c.bark();
        c.getBreed("Pluh");
    }
}
