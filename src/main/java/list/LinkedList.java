package list;

public interface LinkedList {

    LinkedNode add(LinkedNode head, LinkedNode nodeToAdd, int position);

    LinkedNode remove (LinkedNode head, int positionToRemove);

    boolean contains(LinkedNode head, LinkedNode nodeToCheck);

    void printList(LinkedNode head);
}
