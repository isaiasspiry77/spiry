package mx.uv.facing.iinf.poo;

public class GenericTupla<K, V> {
  private K key;
  private V val;
  
  public GenericTupla (K uno, V dos) {
    this.key = uno;
    this.val = dos;
  }

    public K getKey () {
        return key;
    }

    public V getValue () {
        return val;
    }

  @Override
  public String toString () {
    return String.format ("(%s, %s)", key.toString (), val.toString ());
  }

}