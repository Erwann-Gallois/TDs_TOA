import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Bibliotheque extends BibliothequeAbstraite
{
    public String nom;
    private List<Livre> livre_tableau;
    private Set<Livre> biblioLivres;    
    // private Iterable<Livre> it 


    public Iterator<Livre> iterator()
    {
        return biblioLivres.iterator();
    }
    
    public Bibliotheque (String n)
    {
        nom = n;
        livre_tableau = new ArrayList<Livre>();
        biblioLivres = new TreeSet<Livre>();
    }

    public boolean add(Livre l)
    {
        boolean rep = biblioLivres.add(l);
        if (rep)
        {
            livre_tableau.add(l);
        }
        return rep;
    }

    public Livre remove()
    {
        int lastIND = livre_tableau.size() - 1;
        Livre last = livre_tableau.get(lastIND);
        biblioLivres.remove(last);
        livre_tableau.remove(lastIND);
        return last;
    } 

    public void clear()
    {
        biblioLivres.clear();
        livre_tableau.clear();
    }   
}