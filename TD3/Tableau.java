package TD3;

import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;

public class Tableau {
    public static <T> void afficheTab(T[] t)
    {
        for (T e : t)
        {
            System.out.println(e);
        }
    }

    public static <T> void swap (T[] t, int i, int j)
    {
        T tmp = t[i];
        t[i] = t[j];
        t[j] = tmp;
    }

    public static <T extends Comparable<T>> T max (List<T> list, int debut, int fin )
    {
        T maxElem = list.get(debut);
        for (T e : list)
        {
            if (e.compareTo(maxElem) > 0)
            {
                maxElem = e;
            }   
        }
        return maxElem;
    }

    // Predicate permet de faire des fonctions anonymes pour l'appliquer sur chaque element de la collection
    public static <T> int countElements(Collection<T> collection, Predicate<T> predicate) {
        int count = 0;
        for (T element : collection) {
            if (predicate.test(element)) {
                count++;
            }
        }
        return count;
    }

    public static <E> int compte (Collection<E> collection, Propriete<E> propriete)
    {
        int cpt = 0;
        for (E e : collection)
        {
            if (propriete.test(e))
            {
                cpt++;
            }
        }
        return cpt;
    }
    public interface Propriete<E>
    {
        boolean test(E e);
    }

    public static class nbrCharImpair implements Propriete<String>
    {
        public boolean test(String s)
        {
            return s.length()%2 != 0;
        }
    }
    Stack<Integer> stack = new Stack<Integer>();
}
