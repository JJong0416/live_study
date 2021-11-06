package reflection;

import java.lang.reflect.Method;

public class rt2 {
    public void reflectionTest() {
        try {
            Class<?> vectorClass = Class.forName("java.util.Vector");

            Method[] methods = vectorClass.getDeclaredMethods();

            /* 임의의 메서드 지정, 이름으로 확인 */
            Method method = methods[25];
            System.out.println("Class Name : " + method.getDeclaringClass());
            System.out.println("Method Name : " + method.getName());
            System.out.println("Return Type : " + method.getReturnType());

            /* Parameter Types */
            Class<?>[] paramTypes = method.getParameterTypes();
            for(Class<?> paramType : paramTypes) {
                System.out.println("Param Type : " + paramType);
            }

            /* Exception Types */
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            for(Class<?> exceptionType : exceptionTypes) {
                System.out.println("Exception Type : " + exceptionType);
            }

        } catch (ClassNotFoundException e) {
            // Exception Handling
        }
    }

    public static void main(String[] args) {
        new rt2().reflectionTest();
    }
}