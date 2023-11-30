package TD5;

public class Fourchette  {
    private boolean libre;

    public Fourchette(boolean libre) {
        this.libre = libre;
    }

    synchronized public boolean isLibre()
    {
        return libre;
    }

    synchronized public void pf()
    {
        libre = false;
    }

    synchronized public void rf()
    {
        libre = true;
    }

}
