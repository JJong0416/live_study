package liststack;

import list.LinkedNode;
import stack.Stack;

public class LinkedListStack implements Stack {

    public int top;
    public LinkedNode node;

    public LinkedListStack(){
        this.node = null;
        this.top = -1;
    }

    @Override
    public void push(int data) {
        LinkedNode pushNode = new LinkedNode(data);

        if (node == null){
            node = new LinkedNode(data);
            top ++;
        }else{
            node = node.add(node,pushNode,++top);
        }
    }

    @Override
    public int pop() {
        if (this.top == -1){
            System.out.println("Empty");
            return -1;
        }
        return node.remove(node,top--).data;
    }

    @Override
    public boolean isEmpty() {
        return (this.top == -1);
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
