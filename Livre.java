public class Livre
{
    public int isbn;
    public String titre;
    public String auteur;

    public Livre (int i, String t, String a)
    {
        isbn = i;
        titre = t;
        auteur = a;
    }

    @Override 
    public boolean equals (Object l)
    {
        return (l instanceof Livre) 
            && ((Livre)l).isbn == isbn
            && ((Livre)l).titre.equals(this.titre)
            && ((Livre)l).auteur.equals(this.auteur);
    }
}
