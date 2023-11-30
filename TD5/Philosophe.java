package TD5;

public class Philosophe extends Thread {
    public int id;
    public Fourchette fd;
    public Fourchette fg;

    public Philosophe (int id, Fourchette fg, Fourchette fd)
    {
        this.id = id;
        this.fg = fg;
        this.fd = fd;
    }

    public void manger(int i)
    {
        System.out.println("Le philosophe "+ Integer.toString(id) + " mange le repas " + Integer.toString(i));
    }

    public void penser()
    {
    
    }

    public void run()
    {
        int repas = 0;
        while (true)
        {
            penser();
            while(!fd.isLibre())
            {
                penser();
            }
            fd.pf();
            while(!fg.isLibre())
            {
                penser();
            }
            fg.pf();
            manger(repas);
            repas++;
            fd.rf();
            fg.rf();
        }
    }
}
