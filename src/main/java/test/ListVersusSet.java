package test;

import java.util.*;

public class ListVersusSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("one"); // 데이터 저장(추가)
        set.add("4");
        set.add("two");
        set.add("three");
        set.add("5");
        set.add("six");

        System.out.println("저장된 데이터 수 : " + set.size()); // 데이터 수 출력

        Iterator<String> it = set.iterator(); // Iterator(반복자) 생성

        while (it.hasNext()) { // hasNext() : 데이터가 있으면 true 없으면 false
            System.out.println(it.next()); // next() : 다음 데이터 리턴
        }

        System.out.println("--------------------");

        set.remove("three"); // 데이터 제거
        System.out.println("저장된 데이터 수 : " + set.size()); // 저장된 데이터 수 출력
        it = set.iterator(); // 반복자 재생성(위의 반복문에서 next 메서드로 데이터를 다 가져왔기 때문에 재생성을
        // 해야함)

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("--------------------");
    }
}