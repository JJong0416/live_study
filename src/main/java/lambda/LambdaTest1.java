package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** 람다의 기본 개념
 * - 인터페이스에 정의된 추상 메서드가 한개일 경우 사용 가능(Functional intercace)
 */

public class LambdaTest1 {
    public static void main(String[] args) {
        Sub01 sub01 = new Sub01() { // 이건 익명 클래스
            @Override
            public void call(String msg) {
                System.out.println("메세지 : " + msg);
            }
        };
        sub01.call("안녕하세요");

        Sub01 sub02 = (msg -> {
            System.out.println("메세지 :" + msg);
        });
        sub02.call("안녕하세요");

        Sub01 sub03 = msg -> System.out.println("메세저 :" + msg);

        List<String> names = Arrays.asList("서울","광주","대전","구미","부울경");
        System.out.println(1);
        System.out.println(names);
//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

    }
}
