package lab6.ch7MyHashTable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MyHashTableImpl<K,V> implements MyHashTable<K,V>{

    private Pair[] arr;
    private static final int MIN_CAP = 11;
    private static final double maxSize = 0.75;
    private static final double minSize = 0.25;
    private static final double set = 0.5; //determines how full the array should be made
                                            //when resizing
    private int cap;
    private int size = 0;

    public MyHashTableImpl() {
        this.arr = (Pair[]) Array.newInstance(Pair.class,MIN_CAP); // default length
        cap = MIN_CAP;
    }

    @Override
    public V get(K key) {
        assert key!=null;

        int i = Objects.hash(key) %cap;
        while(!key.equals(arr[i].k)){
            i = (i+1) % cap;
        }
        return arr[i] == null? null : arr[i].v;
    }

    @Override
    public void put(K key, V value) {
        assert key!=null;

        int pos = Objects.hash(key) % cap;
        while(arr[pos]!=null && !key.equals(arr[pos].k)){
            pos = (pos+1) % cap;
        }
        if( arr[pos] == null){
            size++;  // increasing the number of elements in the table
        }
        arr[pos] = new Pair(key, value);

        resizeIfNeeded();
    }

    @Override
    public void remove(K key) {
        assert key!=null;
        List<Pair> pairs = new ArrayList<Pair>();

        int i = Objects.hash(key) % cap;
        while(arr[i]!=null && !key.equals(arr[i].k)){
            i = (i+1) % cap;
            if(arr[i] == null) System.out.printf("Could not find key %s %n", key.toString());
        }
        while (arr[i]!=null){
            pairs.add(arr[i]);
            arr[i] = null;
            size--;
            i = (i+1)%cap;
        }
        pairs.remove(0);

        for(Pair p : pairs){
            this.put(p.k,p.v);
        }
    }

    @Override
    public boolean containsKey(K key) {
        int i = Objects.hash(key)%cap;
        while(arr[i]!=null && !key.equals(arr[i].k)){
            i = (i+1)%cap;
        }
        return arr[i] != null;
    }

    @Override
    public int size() {
        return size;
    }

    private void resizeIfNeeded(){
        if(!((size<cap*minSize && cap>MIN_CAP) || size> cap*maxSize)){
            return;
        }
        int newcap = (int)(size/set);

        @SuppressWarnings("unchecked")
        Pair[] a = (Pair[]) Array.newInstance(Pair.class, newcap); // Make the new array

        for(int j=0; j<cap; j++){
            Pair q = arr[j];
            if(q==null)
                continue;

            int i = Objects.hash(q.k) % newcap; // assigning a new position in new arr
            while (a[i]!=null && !q.k.equals(a[i].k)) {
                i = (i+1) % newcap; // get next index
            }
            a[i] = q;
        }
        this.arr = a;
        this.cap = newcap;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Pair pair:arr){
            if(pair!=null) {
                sb.append(pair.k);
                sb.append("-");
                sb.append(pair.v);
                sb.append("\t");
            }
        }
        return sb.toString();
    }

    class Pair{
        K k;
        V v;
        public Pair(K key, V value){
            k = key;
            v = value;
        }
    }
}
