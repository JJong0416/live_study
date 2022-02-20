package generics.queue;

import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements Queue<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public LinkedListQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean offer(E value) {
        Node<E> newNode = new Node<E>(value);

        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        size += 1;
        tail = newNode;
        return true;
    }

    @Override
    public E poll() {

        if (size == 0) {
            return null;
        }

        // 삭제될 요소의 데이터를 반환하기 위한 임시 변수
        E element = head.data;

        // head 노드의 다음 노드
        Node<E> nextNode = head.next;

        // head의 모든 데이터를 삭제
        head.data = null;
        head.next = null;

        // head 가 가르키는 노드를 삭제된 head 노드의 다음 노드로 가르키도록 변경
        head = nextNode;
        size -= 1;

        return element;
    }

    @Override
    public E peek() {
        if (size == 0) {
            return null;
        }
        return head.data;
    }

    public E remove() {

        E element = poll();

        if (element == null) {
            throw new NoSuchElementException();
        }

        return element;
    }

    public boolean contain(Object value){
        /**
         * head 데이터부터 x가 null이 될 때 까지 value랑 x.data랑 같은지를 비교하고,
         * 같다면 true값으로 반환한다.
         */
        for (Node<E> i = head; i != null; i = i.next){
            if (value.equals(i.data)){
                return true;
            }
        }
        return false;
    }
}
