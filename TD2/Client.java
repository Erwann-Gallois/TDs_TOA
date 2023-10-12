package TD2;

public class Client 
{
    String nom;
    String prenom;

    public Client (String n, String p)
    {
        this.nom = n;
        this.prenom = p;
    }

    @Override 
    public boolean equals (Object c)
    {
        if (c instanceof Client)
        {
            return ((Client)c).nom.equals(this.nom)
                && ((Client)c).prenom.equals(this.prenom);
        }
        else
        {
            return false;
        }
    }

    public void afficher ()
    {
        System.out.println(this.nom + " " + this.prenom);
    }
}