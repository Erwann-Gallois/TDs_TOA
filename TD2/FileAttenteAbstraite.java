package TD2;

import java.util.Iterator;

public abstract class FileAttenteAbstraite implements FileAttenteInterface
{
    public static boolean add (Client c)
    {
        Iterator<Client> it = file.iterator();
        while (it.hasNext())
        {
            if (it.next().isEqual(c))
                return false;
        }
        file.add(c);
        return true;
    }

    void remove()
    {
        file.removeFirst();
    }

    Client head()
    {
        return file.getFirst();
    }
}