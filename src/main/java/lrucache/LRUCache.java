package lrucache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private Map<Integer, Node> nodeMap;
    private int capacity; // Cache 용량
    private Node head;
    private Node tail;

    // Initialize
    public LRUCache(int capacity){
        this.nodeMap = new HashMap<>();
        this.capacity = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    // Head 바로 뒤에 node를 Insert. 따라서 O(1)
    public void insertToHead(Node node){
        node.next = this.head.next;
        this.head.next.prev = node;
        node.prev = this.head;
        this.head.next = node;

        nodeMap.put(node.key, node);
    }

    // Tail 바로 앞에꺼를 Delete 하기 때문에, 시간복잡도 O(1)
    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;

        nodeMap.remove(node.key);
    }

    // 시간복잡도 O(1), HashMap이니깐
    public int get(int key){
        if (!nodeMap.containsKey(key))
            return -1;

        Node getNode = nodeMap.get(key);
        remove(getNode);
        insertToHead(getNode);

        return getNode.value;
    }

    // 시간복잡도 O(1)
    public void put(int key, int value){
        Node newNode = new Node(key,value);

        if (nodeMap.containsKey(key)){
            Node oldNode = nodeMap.get(key);
            remove(oldNode);
        }else{
            if (nodeMap.size() >= this.capacity){
                Node delNode = tail.prev;
                remove(delNode);
            }
        }
        insertToHead(newNode);
    }
}
