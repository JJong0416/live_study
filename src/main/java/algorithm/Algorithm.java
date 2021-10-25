package algorithm;

import java.util.ArrayList;

public class Algorithm {
    public static void main(String[] args) {
        int numOfOperation = 6;
    }

    private static class Operation{
        OperationType type;
        Integer value;

        public Operation(OperationType type, Integer value){
            this.type = type;
            this.value = value;
        }
    }
    private static enum OperationType{
        branch,
        merge;
    }
}
