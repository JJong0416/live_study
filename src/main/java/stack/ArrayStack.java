package stack;

public class ArrayStack implements Stack{

    public int[] stack;
    public int top;

    public ArrayStack(int size){
        stack = new int[size];
        top = -1;
    }

    @Override
    public void push(int data) {
        stack[++top] = data;
    }

    @Override
    public int pop() {
        if(top == -1){
            System.out.println("Empty");
            return -1;
        }
        return stack[top--];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == this.stack.length-1);
    }
}
