package annotation;

import java.lang.annotation.Target;

/**
 * javaDoc Test
 */
public class Annotation {

    /**
     * 덧셈을 한다.
     * @param num1
     * @param num2
     * @return num1 + num2
     */
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}