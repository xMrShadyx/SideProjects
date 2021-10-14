package o3_YTCollection.Polymorphism;

class Bird {
    public void sing() {
        System.out.println("Tweet tweet tweet");
    }
}

class Robin extends Bird {
    @Override
    public void sing() {
        System.out.println("Tweedledeedee");
    }
}

class Pelican extends Bird {
    @Override
    public void sing() {
        System.out.println("KWEEK KWEEK KWEEEK");
    }
}

public class o1_Polymorphism {
    public static void main(String[] args) {
        // Polymorphism -> many forms of method.
        Bird b = new Bird();
        b.sing();
        Robin r = new Robin();
        r.sing();
        Pelican p = new Pelican();
        p.sing();
    }
}
