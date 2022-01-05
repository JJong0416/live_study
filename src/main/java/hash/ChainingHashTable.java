//package hash;
//
//import hash.HashItems;
//
///*Chaining HashTable*/
//class ChainingHashTable {
//    public static final int TABLE_SIZE = 10;
//
//    private HashItems[] hashTable;
//
//    public ChainingHashTable() {
//        this.hashTable = new HashItems[TABLE_SIZE];
//    }
//
//    //hash code
//    int getHashCode(String key) {
//        int hashCode = 0;
//        for (char c : key.toCharArray())
//            hashCode += c;
//
//        return hashCode;
//    }
//
//    //hash code를 index
//    private int convertToIndex(int key) {
//        return key % TABLE_SIZE;
//    }
//
//    //삽입
//    public void put(String key, String value) {
//        int hashCode = getHashCode(key);
//        int hashArrayIndex = convertToIndex(hashCode);
//
//        if (hashTable[hashArrayIndex] == null) {
//            //hash table의 슬롯이 비어 있으면 바로 삽입
//            System.out.println("no collision simple insertion");
//            hashTable[hashArrayIndex] = new HashItems(key, value);
//        } else {
//            //hash table의 슬롯이 비어있지 않으면
//            System.out.println("collision when inserting with key : " + key);
//            HashItems hashItem = hashTable[hashArrayIndex]; //hash table 슬롯에 저장된 첫번째 데이터를 가져온다.
//            //연결리스트 마지막까지 탐색을 수행한다.
//            while (hashItem.getNextHashItem() != null) {
//                hashItem = hashItem.getNextHashItem();
//                System.out.println("considering the next item in linked list" + hashItem.getValue());
//            }
//            //마지막으로 연결 리스트 다음에 삽입
//            System.out.println("finally we have found the place to insert...");
//            hashItem.setNextHashItem(new HashItems(key, value));
//        }
//
//    }
//
//    //반환
//    public String get(String key) {
//        int hashCode = getHashCode(key);
//        int hashArrayIndex = convertToIndex(hashCode);
//
//        if (hashTable[hashArrayIndex] == null)
//            return "not found";
//        HashItems hashItem = hashTable[hashArrayIndex];
//        while (hashItem != null && hashItem.getKey() != key)
//            hashItem = hashItem.getNextHashItem();
//
//        if (hashItem == null)
//            return "not found";
//        else
//            return hashItem.getValue();
//
//    }
//}