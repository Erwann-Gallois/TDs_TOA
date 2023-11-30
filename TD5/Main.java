package TD5;

public class Main {
    public static void main(String args[]) {
        Fourchette f1 = new Fourchette(true);
        Fourchette f2 = new Fourchette(true);
        Fourchette f3 = new Fourchette(true);
        Fourchette f4 = new Fourchette(true);
        Fourchette f5 = new Fourchette(true);

        Philosophe p1 = new Philosophe(1, f1, f2);
        Philosophe p2 = new Philosophe(2, f2, f3);
        Philosophe p3 = new Philosophe(3, f3, f4);
        Philosophe p4 = new Philosophe(4, f4, f5);
        // Philosophe p5 = new Philosophe(5, f5, f1); //Cela bug car cela fait un cycle
        Philosophe p5 = new Philosophe(5, f1, f5);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

    }
}
