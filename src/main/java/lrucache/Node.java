package lrucache;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Node {

    /**
     * 편의상 public 접근제어자를 사용했다. 안그러면 prev와 next set해줄 Method를 만들어줘야하기 때문에
     * 가독성을 높히기 위해서 일부로 이렇게 하였다.
     */

    public int key; // 해시 테이블 키
    public int value; // 해시 테이블
    public Node prev; // 이전 노드
    public Node next; // 다음 노드

    public Node(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
