//package hash;
//
///*Linear Probing HashTable*/
//class LinearProbingHashTable {
//    public static final int TABLE_SIZE = 10;
//    private HashItems[] hashTable;
//
//    public LinearProbingHashTable() {
//        this.hashTable = new HashItems[TABLE_SIZE];
//    }
//
//    private int convertToIndex(int hashcode) {
//        return hashcode % TABLE_SIZE;
//    }
//
//    public void put(int key, int value) {
//        //충돌을 발생하기 위해서 key값을 hashcode로 바로 사용
//        //key값이 1, 11, 21 ..이 들어오면 충돌 발생
//        int hashArrayIndex = convertToIndex(key);
//        System.out.println("put() method called with value : " + value + ", hashArrayIndex : " + hashArrayIndex);
//
//        //충돌이 없을 때까지 반복 수행
//        while (hashTable[hashArrayIndex] != null) {
//            //인덱스 1 씩 증가
//            hashArrayIndex = (hashArrayIndex + 1) % TABLE_SIZE;
//            System.out.println("collision -> move to next index : " + hashArrayIndex);
//        }
//        System.out.println("Inserted finally with index : " + hashArrayIndex);
//        hashTable[hashArrayIndex] = new HashItems(key, value);
//
//    }
//
//    public int get(int key) {
//        int hashArrayIndex = convertToIndex(key);
//
//        while (hashTable[hashArrayIndex] != null && hashTable[hashArrayIndex].getKey() != key) {
//            hashArrayIndex = (hashArrayIndex + 1) % TABLE_SIZE;
//            System.out.println("not matched, move to next index : " + hashArrayIndex);
//
//        }
//
//        if (hashTable[hashArrayIndex] == null) return -1;
//        else return hashTable[hashArrayIndex].getValue();
//    }
//}