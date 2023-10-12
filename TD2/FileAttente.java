package TD2;

import java.util.LinkedList;
import java.util.Iterator;

public class FileAttente implements FileAttenteInterface {
    private LinkedList<Client> clients;

    public FileAttente() {
        clients = new LinkedList<Client>();
    }

    public boolean add(Client c) {
        if (clients.contains(c)) {
            return false;
        } else {
            clients.add(c);
            return true;
        }
    }

    public void remove() {
        if (!clients.isEmpty())
            clients.remove(0);
    }

    public Client head() {
        if (clients.isEmpty())
            return null;
        else
            return clients.get(0);
    }

    public void afficher ()
    {
        System.out.println("File d'attente :");
        Integer.toString(clients.size());
        for (Client c : clients)
        {
            c.afficher();
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return clients.isEmpty();
    }

    public void clear() {
        clients.clear();
    }

    public int size() {
        return clients.size();
    }

    public boolean contains(Client c) {
        Iterator<Client> it = clients.iterator();
        while (it.hasNext()) {
            if (it.next().equals(c)) {
                return true;
            }
        }
        return false;
    }
}
