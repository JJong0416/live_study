package queue;

public class QueueNode {

    int value; //값을 넣음
    QueueNode queueNode; //다음 노드를 가리킴

    public QueueNode(int value) {
        this.value = value;
        queueNode = null;
    }
    public int getValue() {
        return value;
    }
    public QueueNode getNextNode() {
        return queueNode;
    }
    public void setNextNode(QueueNode queueNode) {
        this.queueNode = queueNode;
    }
}