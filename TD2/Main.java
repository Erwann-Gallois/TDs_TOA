package TD2;

public class Main {
    public static void main(String[] args) {
        Client c1 = new Client("DUPONT", "Jean");
        Client c2 = new Client("DUPONT", "Jean");
        Client c3 = new Client("DUPONT", "Pierre");
        Client c4 = new Client("DURAND", "Jean");

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(c3));
        System.out.println(c1.compareTo(c4));
    }  

}
