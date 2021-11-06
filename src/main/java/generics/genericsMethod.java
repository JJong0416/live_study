package generics;

// 제네릭 클래스
class ClassName<E> {

    private E element;	// 제네릭 타입 변수

    void set(E element) {	// 제네릭 파라미터 메소드
        this.element = element;
    }

    E get() {	// 제네릭 타입 반환 메소드
        return element;
    }

    <T> T genericMethod(T o) {	// 제네릭 메소드
        return o;
    }
}

public class genericsMethod {
    public static void main(String[] args) {

        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        // 제네릭 메소드 Integer
        System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());

        // 제네릭 메소드 String
        System.out.println("<T> returnType : " + a.genericMethod("ABCD").getClass().getName());

        // 제네릭 메소드 ClassName b
        System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());
    }
}
