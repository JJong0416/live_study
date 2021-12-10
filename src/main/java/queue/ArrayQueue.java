package queue;

public class ArrayQueue implements Queue {
    static final int MAX = 1000;
    int front;    //머리 쪽에 위치할 index값, pop할때 참조하는 index
    int rear;    //꼬리 쪽에 위치할 index값, push할때 참조하는 index
    int [] queue;

    public ArrayQueue() {
        front = rear = -1;    //초기값 -1
        queue = new int[MAX]; //배열 생성
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return rear == MAX - 1;
    }

    @Override
    public int size() {
        return rear - front ;
    }

    @Override
    public int pop() {
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[++front];
    }

    @Override
    public void push(int value) {
        if (isFull()){
            System.out.println("Queue is Full");
            return ;
        }
        queue[++rear] = value;
    }

    @Override
    public int peek() {
        return 0;
    }
}