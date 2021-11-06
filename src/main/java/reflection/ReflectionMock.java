package reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionMock {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        /* 클래스 찾기 */
        Class clazz = Child.class;
        System.out.println("Class name: " + clazz.getName());

        Class clazz2 = Class.forName("reflection.Child"); // 없는 class라면 Run Time Error
        System.out.println("Class name: " + clazz2.getName());

        System.out.println("");

        /* Constructor 찾기 */
        Class clazz3 = Class.forName("reflection.Child");
        Constructor constructor1 = clazz.getDeclaredConstructor(); // 인자 없는 Construct 가져오기
        System.out.println("Constructor: " + constructor1.getName());

        Class clazz4 = Class.forName("reflection.Child");
        Constructor constructor2 = clazz4.getDeclaredConstructor(Integer.class);
        System.out.println("Constructor(String): " + constructor2.getName());

        /* Method 호출 */
        Class clazz5 = Class.forName("reflection.Child");
        Method method = clazz.getDeclaredMethod("method4", int.class);
//        int returnValue = (int) method.invoke(Child, 10);
//        System.out.println("return value: " + returnValue);

    }
}
