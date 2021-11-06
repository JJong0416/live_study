package reflection;


import java.lang.reflect.Method;

public class reflectionTest {
    // 리플렉션 단점 꼭 찾아보길 바랍니다 ㅠㅠ
    public void reflection(){
        try{
            Class vectorClass = Class.forName("java.util.Vector");

            Method[] methods = vectorClass.getDeclaredMethods();

            for (Method method: methods) {
                System.out.println(method.toString());
            }

        } catch (ClassNotFoundException e) {
            // Exception Handling
        }
    }

    public static void main(String[] args) {
        new reflectionTest().reflection();
    }


}
