package test;

public interface Queue<T> {

        void enqueue(T item);

        T dequeue();
}
