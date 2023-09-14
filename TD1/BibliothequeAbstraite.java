public abstract class BibliothequeAbstraite implements Interface_Bibliotheque{
    public int size()
    {
        Livre l = this.remove();
        int i = 0;
        while (l != null)
        {
            i++;
            this.add(l);
            l = this.remove();
        }
        return i;
    }
    public boolean isEmpty()
    {
        if (size() == 0)
        {
            return true;
        }
        return false;
    }

    public boolean contains (Livre l)
    {
        Livre l2 = this.remove();
        boolean rep = false;
        while (l2 != null)
        {
            if (l2.equals(l))
            {
                rep = true;
            }
            this.add(l2);
            l2 = this.remove();
        }
        return rep;
    }

    public boolean addAll(Interface_Bibliotheque b)
    {
        boolean modifier = false;
        Livre l = b.remove();
        while (l != null)
        {
            if (this.add(l))
            {
                modifier = true;
            }
            l = b.remove();
        }
        return modifier;
    }

    public boolean removeAll (Interface_Bibliotheque b)
    {
        boolean modifier = false;
        Livre l = b.remove();
        while (l != null)
        {
            if (this.contains(l))
            {
                this.remove();
                modifier = true;
            }
            l = b.remove();
        }
        return modifier;
    }

    public void clear(){
        Livre l = this.remove();
        while (l != null)
        {
            l = this.remove();
        }
    }
}
