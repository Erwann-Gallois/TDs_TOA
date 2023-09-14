public interface Interface_Bibliotheque {
    int size();
    boolean isEmpty();
    boolean contains (Livre l);
    // ajoute un livre à la bibliotheque s'in n'exyst pas deja (Meme ISBN)
    boolean add(Livre l);
    Livre remove();
    boolean addAll(Interface_Bibliotheque b);
    boolean removeAll(Interface_Bibliotheque b);
    void clear();
}
