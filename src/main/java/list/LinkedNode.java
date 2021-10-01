package list;

public class LinkedNode implements LinkedList{

     public int data;
     public LinkedNode next;

    public LinkedNode(){}

    public LinkedNode(int data){
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString(){
        return String.valueOf(data);
    }

    @Override
    public LinkedNode add(LinkedNode head, LinkedNode nodeToAdd, int position) {
        LinkedNode node = head;

        // position 전까지 탐색
        for( int i = 0; i < position -1; i++){
            node = node.next;
        }

        // 지정 위치에 노드 삽입
        nodeToAdd.next = node.next;
        node.next = nodeToAdd;

        return head;
    }

    @Override
    public LinkedNode remove(LinkedNode head, int positionToRemove) {
        LinkedNode node = head;

        /* 삭제가 맨 앞일 경우 */
        if(positionToRemove == 0){
            LinkedNode deleteToNode = node;
            head = node.next;
            deleteToNode.next = null;
            return deleteToNode;
        }

        /* 맨 앞이 아닐 경우, 삭제할 바로 앞 노드까지 이동*/
        for (int i = 0; i < positionToRemove -1; i++){
            node = node.next;
        }

        /* 해당 위치 노드 삭제 */
        LinkedNode deleteToNode = node.next;
        node.next = deleteToNode.next;
        deleteToNode.next = null;
        return deleteToNode;

    }

    @Override
    public boolean contains(LinkedNode head, LinkedNode nodeToCheck) {
        while (head.next != null){
            if (head.next == nodeToCheck)
                return true;
            head = head.next;
        }
        return false;
    }

    @Override
    public void printList(LinkedNode head) {
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
