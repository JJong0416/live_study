import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import stack.ArrayStack;

public class ArrayStackTest {

    private ArrayStack arrayStack;
    private static final int[] EXISTED_DATA = {1,3,5,7,9};

    @BeforeEach
    void setupArrayStack(){
        arrayStack = new ArrayStack(5);
    }

    @Test
    void push() {
        arrayStack.push(1);
        arrayStack.push(3);
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(9);

        for(int i=0; i<arrayStack.stack.length; i++){
            Assertions.assertEquals(EXISTED_DATA[i],arrayStack.stack[i]);
        }
    }

    @Test
    void pop() {
        arrayStack.push(1);
        arrayStack.push(3);
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(9);

        Assertions.assertEquals(9,arrayStack.pop());
    }

    @Test
    void isEmpty(){
        arrayStack.push(1);
        arrayStack.pop();

        Assertions.assertEquals(arrayStack.isEmpty(),true);
    }

    @Test
    void isFull(){
        arrayStack.push(1);
        arrayStack.push(3);
        arrayStack.push(5);
        arrayStack.push(7);
        arrayStack.push(9);

        Assertions.assertEquals(arrayStack.isFull(),true);
    }
}
