package queue;

public interface Queue {

    boolean isEmpty();

    boolean isFull();

    int size();

    int pop();

    void push(int value);

    int peek();
}
