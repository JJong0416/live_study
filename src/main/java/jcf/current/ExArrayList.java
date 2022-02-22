package jcf.current;

import java.util.HashSet;

public class ExArrayList {
    public static void main(String[] args) {
        HashSet<String> hs01 = new HashSet<String>();
        HashSet<String> hs02 = new HashSet<String>();

        // add() 메소드를 이용한 요소의 저장
        hs01.add("홍길동");
        hs02.add("이순신");

        // 중복된 요소 저장 테스트
        System.out.println(hs01.add("임꺽정"));
        System.out.println(hs01.add("임꺽정"));

        // Enhanced for문과 get() 메소드를 이용한 요소의 출력

        for (String e : hs01) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
