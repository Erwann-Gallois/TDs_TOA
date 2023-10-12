package TD3;

public class Couple<K, V>
{
    // Attributs
    private final K key;
    private V value;

    // Constructeur
    public Couple(K k, V v)
    {
        this.key = k;
        this.value = v;
    }

    // Méthodes
    public K getKey()
    {
        return key;
    }

    public V getValue()
    {
        return value;
    }

    public void setValue(V v)
    {
        value = v;
    }

    public static <T> void afficheTab(T[] t)
    {
        for (T e : t)
        {
            System.out.println(e);
        }
    }

    public static <T> void swap (T[] t, int i, int j)
    {
        T tmp = t[i];
        t[i] = t[j];
        t[j] = tmp;
    }
}