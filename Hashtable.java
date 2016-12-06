import java.util.ArrayList;

public class Hashtable<K, V> {

    private class Hashnode {
	
	public K key;
	public V value;
	private Hashnode next;
	
	public Hashnode(K key, V value) {
	    this.key = key;
	    this.value = value;
	}
	
	public Hashnode getNext() {
	    return this.next;
	}
	
	public void setNext(Hashnode next) {
	    this.next = next;
	}
	
	public K getKey() {
	    return this.key;
	}
	
	public V getValue() {
	    return this.value;
	}
    }
    
    private ArrayList<Hashnode> HNArray;
    private ArrayList<K> keyArray;
    private ArrayList<V> valueArray;
    private int sizeArray;
    private int inArray;
    private double loadFactor;
    
    public Hashtable() {
	keyArray = new ArrayList<K>(20);
	valueArray = new ArrayList<V>(20);
	HNArray = new ArrayList<Hashnode>(20);
	sizeArray = 20;
	inArray = 0;
	//loadFactor = 0.75;
	clear();
    }

    public Hashtable(int size) {
	keyArray = new ArrayList<K>(size);
	valueArray = new ArrayList<V>(size);
	HNArray = new ArrayList<Hashnode>(size);
	sizeArray = size;
	inArray = 0;
	//loadFactor = 0.75;
	clear();
    }

    public void clear() {
	for (int i = 0; i < sizeArray; i++) {
	    keyArray.set(i, null);
	    valueArray.set(i, null);
	    HNArray.set(i, null);
	}
	inArray = 0;
    }

    public void insertSepChain(K key, V value) {	 
	Hashnode HN = new Hashnode(key, value);
	int intKey = (Integer)key;
	int index = intKey % sizeArray;
	Hashnode HNatIndex = HNArray.get(index);
	if (HNatIndex == null) {
	    HNArray.set(index, HN);
	    inArray++;
	} else {
	    while (HNatIndex.getNext() != null) {
		HNatIndex = HNatIndex.getNext();
	    }
	    HNatIndex.setNext(HN);
	}
	/*
	if ((float)inArray / (float)sizeArray >= loadFactor) {
	    ArrayList<Hashnode> tmp = new ArrayList<Hashnode>(size*2);
	    HNArray.addAll(0, tmp);
	    HNArray = tmp;
	*/
	}
    }

    public ArrayList<V> getSepChain(K key) {
	ArrayList<V> ret = new ArrayList<V>();
	int intKey = (Integer)key;
	int index = intKey % sizeArray;
	Hashnode HNatIndex = HNArray.get(index);
	if (HNatIndex == null) {
	    return ret;
	} else {
	    while (HNatIndex.getValue() != null) {
		ret.add(HNatIndex.getValue());
		HNatIndex = HNatIndex.getNext();
	    }
	} return ret;
    }
    
    public void insertLinear(K key, V value) {
	int intKey = (Integer)key;
	int index = intKey % sizeArray;
	for (int i = 0; keyArray.get(index) != null; i++) {
	    index = (intKey + i) % sizeArray;
	}
	keyArray.set(index, key);
	valueArray.set(index, value);
	inArray++;
	/*
	if ((float)inArray / (float)sizeArray >= loadFactor) {
	    ArrayList<K> tmpKey = new ArrayList<K>(size*2);
	    ArrayList<V> tmpVal = new ArrayList<V>(size*2);
	    keyArray.addAll(0, tmpKey);
	    valueArray.addAll(0, tmpVal);
	    keyArray = tmpKey;
	    valueArray = tmpVal;
	}
	*/
    }

    public ArrayList<V> getLinear(K key) {
	ArrayList<V> ret = new ArrayList<V>();
	int intKey = (Integer)key;
	int index = intKey % sizeArray;
	for (int i = 0; keyArray.get(index) != null; i++) {
	    if (keyArray.get(index) == key) {
		ret.add(valueArray.get(index));
		index = (intKey + i) % sizeArray;
	    }
	}
	return ret;
    }
    
    public void insertQuad(K key, V value) {
	int intKey = (Integer)key;
	int index = intKey % sizeArray;
	for (int i = 0; keyArray.get(index) != null; i++) {
	    index = (intKey + i*i) % sizeArray;
	}
	keyArray.set(index, key);
	valueArray.set(index, value);
	inArray++;
    }

    public ArrayList<V> getQuad(K key) {
	ArrayList<V> ret = new ArrayList<V>();
	int intKey = (Integer)key;
	int index = intKey % sizeArray;
	for (int i = 0; keyArray.get(index) != null; i++) {
	    if (keyArray.get(index) == key) {
		ret.add(valueArray.get(index));
		index = (intKey + i*i) % sizeArray;
	    }
	}
	return ret;
    }
    
    public void insertDouble(K key, V value) {
	int intKey = (Integer)key;
	int index = intKey % sizeArray;
	for (int i = 0; keyArray.get(index) != null; i++) {
	    index = (intKey + (i * (7 - (intKey % 7)))) % sizeArray;
	}
	keyArray.set(index, key);
	valueArray.set(index, value);
	inArray++;
    }

    public ArrayList<V> getDouble(K key) {
	ArrayList<V> ret = new ArrayList<V>();
	int intKey = (Integer)key;
	int index = intKey % sizeArray;
	for (int i = 0; keyArray.get(index) != null; i++) {
	    if (keyArray.get(index) == key) {
		ret.add(valueArray.get(index));
		index = (intKey + (i * (7 - (intKey % 7)))) % sizeArray;
	    }
	}
	return ret;
    }
}
