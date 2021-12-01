package jcf.list;

import java.util.LinkedList;

public class _LinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(80);
        ll.add(30);
        ll.addFirst(50); // 가장 앞에 데이터를 추가
        ll.addLast(20); // 가장 뒤에 데이터를 추가
        ll.add(10); // 순차적 데이터 추가
        ll.add(2, 60); // 2번째 index에 60 추가

        ll.removeFirst(); // 가장 앞의 데이터를 제거

        ll.remove(3); // 3번째 인덱스 제거

        ll.removeLast(); // 가장 뒤의 데이터를 제거

        System.out.println(ll.size()); // ll의 사이즈 반환

        System.out.println(ll.contains(30));// boolean타입 메소드, 30이 있는지 체크

        ll.indexOf(60); // 60이 있는 index를 반환, 존재하지 않으면 -1 반환

        // LinkedList 탐색을 위한 Iterator 객체 생성

        for (Integer integer : ll) { // boolean타입 메소드, 다음 인덱스가 있는지 체크
            System.out.print(integer + " "); // 엘리먼트를 순서대로 반환
        }
    }
}