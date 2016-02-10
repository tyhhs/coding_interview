package practice;

public class HashTable {

	class HashEntry{
		private int key;
		private int value;
		public HashEntry(int key, int value){
			this.key = key;
			this.value = value;
		}
		public int getKey(){
			return this.key;
		}
		public int getValue(){
			return this.value;
		}
	}
	
	private final static int TABLE_SIZE = 128;
	private HashEntry[] table;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable table = new HashTable();
		table.put(1, 1);
		table.put(3, 8);
		System.out.println(table.getValue(1));
		System.out.println(table.getValue(3));
		System.out.println(table.getValue(5));
		table.remove(1);
		System.out.println(table.getValue(1));
	}

	public HashTable(){
		this.table = new HashEntry[TABLE_SIZE];
		//initialize the table
		for(int i = 0; i < TABLE_SIZE; i++){
			table[i] = null;
		}		
	}
	
	public int getValue(int key){
		int hashCode = key % TABLE_SIZE;
		while(table[hashCode] != null && table[hashCode].getKey() != key){
			hashCode = (hashCode + 1) % TABLE_SIZE;
		}
		if(table[hashCode] == null) return -1;
		return table[hashCode].getValue();
	}
	public void put(int key, int value){
		int hashCode = key % TABLE_SIZE;
		while(table[hashCode] != null && table[hashCode].getKey() != key){
			hashCode = (hashCode + 1) % TABLE_SIZE;
		}
		table[hashCode] = new HashEntry(key, value);
	}
	
	public void remove(int key){
		int hashCode = key % TABLE_SIZE;
		while(table[hashCode] != null && table[hashCode].getKey() != key){
			hashCode = (hashCode + 1) % TABLE_SIZE;
		}
		table[hashCode] = null;
	}
}
