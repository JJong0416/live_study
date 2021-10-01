import list.LinkedList;
import list.LinkedNode;
import org.springframework.boot.test.context.SpringBootTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class LinkedListTest {
    private LinkedNode listNode;
    private static final int[] EXISTING_DATA = {1,3,4,5,7,9};
    private static final boolean[] CONTAINS_DATA = {true, false};
    private static List<Integer> acc_data;

    @BeforeEach
    void setupLinkedList() {
        acc_data = new ArrayList<>();

        listNode = new LinkedNode();
        LinkedNode firstNode = new LinkedNode(1);
        LinkedNode secondNode = new LinkedNode(3);
        LinkedNode thirdNode = new LinkedNode(5);
        LinkedNode fourthNode = new LinkedNode(7);
        LinkedNode fifthNode = new LinkedNode(9);

        this.listNode = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
    }

    @Test
    void linkedListAdd(){
        listNode = listNode.add(listNode,new LinkedNode(4),2);

        while (listNode != null){
            acc_data.add(listNode.data);
            listNode = listNode.next;
        }

        for (int i = 0; i<acc_data.size();i++){
            Assertions.assertEquals(EXISTING_DATA[i],acc_data.get(i));
        }
    }

    @Test
    void linkedListRemove(){
        LinkedNode remove = listNode.remove(listNode,2); // 2번 인덱스 삭제
        Assertions.assertEquals(5, remove.data);
    }

    @Test
    void linkedListContains(){
        boolean[] result = new boolean[2];
        result[0] = listNode.contains(listNode,new LinkedNode(9));
        result[1] = listNode.contains(listNode,new LinkedNode(10));

        for (int i =0; i< acc_data.size();i++){
            Assertions.assertEquals(CONTAINS_DATA[i],result[i]);
        }
    }
}