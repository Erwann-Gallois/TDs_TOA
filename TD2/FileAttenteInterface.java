package TD2;

public interface FileAttenteInterface {
    boolean add(Client c);
    void remove();
    Client head();
    boolean isEmpty();
    void clear();
    int size();
    boolean contains(Client c);
}
