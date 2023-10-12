package TD3;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Couple<Integer, String> couple1 = new Couple<Integer, String>(1, "un");
        // Couple<Integer, String> couple2 = new Couple<Integer, String>(2, "deux");

        String[] tab = {"un", "deux", "trois"};
        Tableau.afficheTab(tab);

        Integer[] tab2 = {1, 2, 3};
        Tableau.afficheTab(tab2);

        Tableau.swap(tab, 0, 1);
        Tableau.afficheTab(tab);

        List<String> tab3 = List.of("un", "deux", "trois");
        System.out.println(Tableau.max(tab3, 0, 2));
        
        Collection<String> tab4 = List.of("un", "deux", "trois", "quatre", "cinq");
        System.out.println(Tableau.countElements(tab4, (String s) -> s.length()%2 != 0));
        
   }
}
