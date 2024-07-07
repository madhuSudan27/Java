package GenericClass;

import java.security.PrivateKey;

public class Pair<K,V> {

    private K key;
    private V value;

    Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    Pair(){

    }

    public void put(K key,V value ) {
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}
